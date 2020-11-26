function loadAgencies(tagID) {
    backendURL = "http://localhost:8080";
    apiPath = "/login";
    
    fetch(backendURL+apiPath, msg)
        .then(resp => resp.json())
        .then(list => createSelector(list,tagID));
}

function createSelectorOptions(list,tagID) {
    let selectorHTML = "";

    for (let i=0; i<list.length; i++) {
        let ag = list[i];
        selectorHTML += `<option value="${list[i].id}">${list[i].name}</option>`;
    }

    document.getElementById(tagID).innerHTML = selectorHTML;
}