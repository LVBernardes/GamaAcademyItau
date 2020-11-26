backendURL = "http://localhost:8080";

function validateUserSession() {
    var userRaw = localStorage.getItem("UserData");

    if (!userRaw) {

        window.location = "index.html";

    } else {

        var user = JSON.parse(userRaw);

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
        console.log(list[i].id + " " + list[i].name)
        selectorHTML += `<option value="${list[i].id}">${list[i].name}</option>`;
    }

    document.getElementById(tagID).innerHTML = selectorHTML;
}