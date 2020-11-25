function auth() {
    var userLogin = document.getElementById("userID").value;
    var userPswrd = document.getElementById("userPswrd").value;
    var backendURL = "http://localhost:8080/login"

    var msgBody = {
        email: userLogin,
        racf: userLogin,
        pswrd: userPswrd
    };
    
    var msgHeaders = {
        "Content-Type" : "application/json"
    };

    var msg = {
        method: "POST",
        body: JSON.stringify(msgBody),
        headers: msgHeaders
    };

    fetch(backendURL, msg).then(resp => treatResponse(resp));
}

function treatResponse(response) {

    if (response.status == 200) {
        document.getElementById("loginMsg").innerHTML = "Redirecionando"
        response.json().then(user => executeLogin(user));

    } else if (response.status == 401) {
        document.getElementById("loginMsg").innerHTML = "Senha inválida";

    } else if (response.status == 404) {
        document.getElementById("loginMsg").innerHTML = "Usuário inválido";

    } else {
        document.getElementById("loginMsg").innerHTML = "Erro desconhecido";
    }

}

function executeLogin(user) {
    console.log(user);
    localStorage.setItem("UserData",JSON.stringify(user));
    window.location = "reports.html";
}