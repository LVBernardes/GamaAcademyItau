function validateUserSession() {
    var userRaw = localStorage.getItem("UserData");
    
    if (!userRaw) {

        window.location = "index.html";

    } else {

        var user = JSON.parse(userRaw);

        document.getElementById("userPhoto").innerHTML = `<img src="${user.photoLink}" width="100%">`;

        document.getElementById("userBio").innerHTML = `<h4>${user.name}<\h4>
                                                        <p>E-mail: ${user.email}<\p>
                                                        <p>RACF: ${user.racf}<\p>`;

    }

}

function loadAgencies(tagID) {
    backendURL = "http://localhost:8080";
    apiPath = "/agencias";
    
    fetch(backendURL+apiPath)
        .then(resp => resp.json())
        .then(list => createSelectorOptions(list,tagID));
}

function createSelectorOptions(list,tagID) {
    let selectorHTML = "";

    for (let i=0; i<list.length; i++) {
        let ag = list[i];
        selectorHTML += `<option value="${list[i].id}">${list[i].name}</option>`;
    }

    document.getElementById(tagID).append(selectorHTML);
}