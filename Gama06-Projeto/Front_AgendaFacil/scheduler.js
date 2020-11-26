backendURL = "http://localhost:8080";

function loadAgencies(tagID) {
    apiPath = "/agencias";


    fetch(backendURL + apiPath)
        .then(resp => resp.json())
        .then(list => createSelectorOptions(list, "id", "name", tagID));
}


function createSelectorOptions(list, listID, listName, tagID) {
    let selectorHTML = `<option selected>Selecione uma opção</option>`;

    for (let i = 0; i < list.length; i++) {
        console.log(list[i].id + " " + list[i].name)
        selectorHTML += `<option value="${list[i].id}">${list[i].name}</option>`;
    }

    document.getElementById(tagID).innerHTML = selectorHTML;
}

function createSchedule() {
    apiPath = "/novoagendamento";

    let customName = document.getElementById("customerName").value;
    let customEmail = document.getElementById("customerEmail").value;
    let customPhone = document.getElementById("customerPhone").value;
    let schedDate = document.getElementById("schedDate").value;
    let schedTime = document.getElementById("schedTime").value;
    let obs = document.getElementById("obs").value;
    let agency = parseInt(document.getElementById("agency").value);

    let msgBody = {
        customerName : customName,
        customerEmail : customEmail,
        customerPhone : customPhone,
        schedulingDate : schedDate,
        schedulingTime : schedTime,
        observation : obs,
        agency : agency
    }

    let msgHeader = {
        "content-type": "application/json"
    }

    let msg = {
        method : "POST",
        body : JSON.stringify(msgBody),
        headers : msgHeader
    }

    fetch(backendURL + apiPath, msg).then(resp => treatResponse(resp));
}

function treatResponse(resp) {
    if (resp.status == 201) {
        alert("Solicitacao de agendamento Efetivada!")
    }
    else {
        alert("ERRO ao atender solicitacao");
    }
}