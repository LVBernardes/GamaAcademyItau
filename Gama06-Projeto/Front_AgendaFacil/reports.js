backendURL = "http://localhost:8080";

function validateUserSession() {

    let userRaw = localStorage.getItem("UserData");

    if (!userRaw) {

        window.location = "index.html";

    } else {

        let user = JSON.parse(userRaw);

        document.getElementById("userPhoto").innerHTML = `<img src="${user.photoLink}" width="100%">`;

        document.getElementById("userBio").innerHTML = `<h4>${user.name}<\h4>                                                 <p>E-mail: ${user.email}<\p>                                                    <p>RACF: ${user.racf}<\p>`;

    }

}

function loadAgencies(tagID) {

    apiPath = "/agencias";


    fetch(backendURL + apiPath)
        .then(resp => resp.json())
        .then(list => createSelectorOptions(list, "id", "name", tagID));
}


function createSelectorOptions(list, listID, listName, tagID) {
    let selectorHTML = `<option value="0"  selected>Selecione uma opção</option>`;

    for (let i = 0; i < list.length; i++) {
        selectorHTML += `<option value="${list[i].id}">${list[i].name}</option>`;
    }

    document.getElementById(tagID).innerHTML = selectorHTML;
}


function generateReport() {

    let apiPath = "/agendamentos"

    let agencyCheck = + document.getElementById("agencyCheck").checked;
    let dateCheck = + document.getElementById("dateCheck").checked;
    let nameCheck = + document.getElementById("nameCheck").checked;
    let agencyFilter = document.getElementById("agencyFilter");
    let dateFilter = document.getElementById("dateFilter");
    let nameFilter = document.getElementById("nameFilter");

    let dateType = 1;

    //console.log(agencyCheck + " " + dateCheck + " " + nameCheck);
    let mode = parseInt("" + nameCheck + dateCheck + agencyCheck, 2);

    console.log(mode);

    switch (mode) {
        case 0:
            agencyFilterValue = 0;
            dateFilterValue = "01/01/01";
            nameFilterValue = "";
            break;
        case 1:
            agencyFilterValue = agencyFilter.value;
            dateFilterValue = "01/01/01";
            nameFilterValue = "";
            if (agencyFilterValue == 0) {
                agencyFilter.focus();
                alert("Selecione uma agência antes de prosseguir!")
                return 1;
            }
            break;
        case 2:
            agencyFilterValue = 0;
            dateFilterValue = convertISODateToCustomDate(dateFilter.value, dateType);
            nameFilterValue = "";
            if (!dateFilterValue) {
                dateFilter.focus();
                alert("Selecione uma data antes de prosseguir!");
                return 1;
            }
            break;
        case 3:
            agencyFilterValue = agencyFilter.value;
            dateFilterValue = convertISODateToCustomDate(dateFilter.value, dateType);
            nameFilterValue = "";
            if (agencyFilterValue == 0) {
                if (dateFilterValue == "") {
                    agencyFilter.focus();
                    alert("Selecione a agência e a data antes de prosseguir!");
                    return 1;
                } else {
                    agencyFilter.focus();
                    alert("Selecione a agência antes de prosseguir!");
                    return 1;
                }
            }
            break;
        case 4:
            agencyFilterValue = 0;
            dateFilterValue = "01/01/01";
            nameFilterValue = nameFilter.value;
            if (nameFilterValue == "") {
                nameFilter.focus();
                alert("Preencha um nome antes de prosseguir!");
                return 1;
            }
            break;
        case 5:
            agencyFilterValue = agencyFilter.value;
            dateFilterValue = "01/01/01";
            nameFilterValue = nameFilter.value;
            if (agencyFilterValue == 0) {
                if (nameFilterValue == "") {
                    agencyFilter.focus();
                    alert("Selecione a agência e preencha um nome antes de prosseguir!");
                    return 1;
                } else {
                    agencyFilter.focus();
                    alert("Selecione a agência antes de prosseguir!");
                    return 1;
                }
            }
            break;
        case 6:
            agencyFilterValue = 0;
            dateFilterValue = convertISODateToCustomDate(dateFilter.value, dateType);
            nameFilterValue = nameFilter.value;
            if (dateFilterValue == "") {
                if (nameFilterValue == "") {
                    dateFilter.focus();
                    alert("Selecione uma data e preencha um nome antes de prosseguir!");
                    return 1;
                } else {
                    dateFilter.focus();
                    alert("Selecione uma data antes de prosseguir!");
                    return 1;
                }
            }
            break;
        case 7:
            agencyFilterValue = agencyFilter.value;
            dateFilterValue = convertISODateToCustomDate(dateFilter.value, dateType);
            nameFilterValue = nameFilter.value;

            if (agencyFilterValue == 0) {
                if (dateFilterValue == "") {
                    if (nameFilterValue == "") {
                        agencyFilter.focus();
                        alert("Selecione a agência, a data e preencha um nome antes de prosseguir!");
                        return 1;
                    } else {
                        agencyFilter.focus();
                        alert("Selecione a agência e a data antes de prosseguir!");
                        return 1;
                    }

                } else {
                    if (nameFilterValue == "") {
                        agencyFilter.focus();
                        alert("Selecione a agência e preencha um nome antes de prosseguir!");
                        return 1;
                    } else {
                        agencyFilter.focus();
                        alert("Selecione a agência antes de prosseguir!");
                        return 1;
                    }

                }
            } else {
                if (dateFilterValue == "") {
                    if (nameFilterValue == "") {
                        dateFilter.focus();
                        alert("Selecione uma data e preencha um nome antes de prosseguir!");
                        return 1;
                    } else {
                        dateFilter.focus();
                        alert("Selecione uma data antes de prosseguir!");
                        return 1;
                    }
                }
            }
            break;

    }

    let url = new URL(backendURL + apiPath)
    let params = {
        mode: mode,
        name: nameFilterValue,
        date: dateFilterValue,
        agencyID: agencyFilterValue
    }
    Object.keys(params).forEach(key => url.searchParams.append(key,
        params[key]));

    //console.log(url);
    //console.log(dateFilter);



    fetch(url).then(resp =>
        resp.json().then(data => ({
            data: data,
            status: resp.status
        })
        ).then(response => showSchedulings(response)));

}

function showSchedulings(response) {
    if (response.status == 200) {
        console.log(response.status);
        console.log(response.data);

        let listHTML = presentReportHTML(response.data);

        document.getElementById("reportPanel").innerHTML = listHTML;

    } else {
        console.log(response.status);
        console.log(response);
    }
}

function convertISODateToCustomDate(dateISO, type) {
    if (dateISO != "") {
        date = dateISO.split("-");
        let year = date[0].slice(2);
        let month = date[1];
        let dt = date[2];

        switch (type) {
            case 0:
                return (month + '/' + dt + '/' + year);
            case 1:
                return (dt + '/' + month + '/' + year);
        }

    } else {
        return "";
    }

}

function presentReportHTML(array) {

    reportLines = "";

    for (let i = 0; i < array.length; i++) {
        reportLines += `<div class="row reportLine">
        <div class="col-xs-6 col-sm-6 col-md-2 col-lg-1 col-xl-2">
           ${array[i].schedulingDate}
        </div>
        <div class="col-xs-6 col-sm-6 col-md-2 col-lg-1 col-xl-1">
           ${array[i].schedulingTime}
        </div>
        <div class="col-xs-12 col-sm-12 col-md-8 col-lg-4 col-xl-4">
           ${array[i].customerName}
        </div>
        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3 col-xl-3">
           ${array[i].customerEmail}
        </div>
        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3 col-xl-2">
           ${array[i].customerPhone}
        </div>
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
           Agencia: ${array[i].agency.name}
        </div>
        <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 col-xl-12">
           ${array[i].observation}
        </div>
        </div>`;
    }
    return reportLines;

}