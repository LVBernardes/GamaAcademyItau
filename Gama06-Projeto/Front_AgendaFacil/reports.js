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
    let selectorHTML = `<option selected>Selecione uma opção</option>`;

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

    //console.log(agencyCheck + " " + dateCheck + " " + nameCheck);
    let mode = parseInt("" + nameCheck + dateCheck + agencyCheck, 2);

    console.log(mode);
    switch (mode) {
        case 0:
            agencyFilter = 0;
            dateFilter = "01/01/01";
            nameFilter = "";
            break;
        case 1:
            agencyFilter = document.getElementById("agencyFilter").value;
            dateFilter = "01/01/01";
            nameFilter = "";
            break;
        case 2:
            agencyFilter = 0;
            dateFilter = document.getElementById("dateFilter").value;
            nameFilter = "";
            break;
        case 3:
            agencyFilter = document.getElementById("agencyFilter").value;
            dateFilter = document.getElementById("dateFilter").value;
            nameFilter = "";
            break;
        case 4:
            agencyFilter = 0;
            dateFilter = "01/01/01";
            nameFilter = document.getElementById("nameFilter").value;
            break;
        case 5:
            agencyFilter = document.getElementById("agencyFilter").value;
            dateFilter = "01/01/01";
            nameFilter = document.getElementById("nameFilter").value;
            break;
        case 6:
            agencyFilter = 0;
            dateFilter = document.getElementById("dateFilter").value;
            nameFilter = document.getElementById("nameFilter").value;
            break;
        case 7:
            agencyFilter = document.getElementById("agencyFilter").value;
            dateFilter = document.getElementById("dateFilter").value;
            nameFilter = document.getElementById("nameFilter").value;
            break;

    }

    let url = new URL(backendURL + apiPath)
    let params = {
        mode: mode,
        name: nameFilter,
        date: dateFilter,
        agencyID: agencyFilter
    }
    Object.keys(params).forEach(key => url.searchParams.append(key,
        params[key]));

    //console.log(url);
    //console.log(dateFilter);

    fetch(url)
        .then(resp => resp.json())
        .then(jsonResp => showSchedulings(jsonResp));

}

function showSchedulings(response) {
    if (response.status == 200) {
        console.log(response);
    } else {
        console.log(response);
    }
}