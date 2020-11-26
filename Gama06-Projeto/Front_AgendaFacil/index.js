function auth() {
    var userLogin = document.getElementById("userID").value;
    var userPswrd = document.getElementById("userPswrd").value;
    var backendURL = "http://localhost:8080/login"

    //document.getElementById("loginButton").setAttribute("aria-pressed", "false");

    if (!userLogin) {

        document.getElementById("loginMsg").innerHTML = "Por favor, informe o usuário e senha para prosseguir.";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-primary text-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");

    } else if (!userPswrd) {

        document.getElementById("loginMsg").innerHTML = "Por favor, informe a senha para prosseguir.";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-primary text-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");

    } else {

        var msgBody = {
            email: userLogin,
            racf: userLogin,
            pswrd: userPswrd
        };

        var msgHeaders = {
            "Content-Type": "application/json"
        };

        var msg = {
            method: "POST",
            body: JSON.stringify(msgBody),
            headers: msgHeaders
        };

        fetch(backendURL, msg).then(resp => treatResponse(resp));

    }

}

function treatResponse(response) {

    if (response.status == 200) {
        document.getElementById("loginMsg").innerHTML = "Redirecionando";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-primary text-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");;

        response.json().then(user => executeLogin(user));

    } else if (response.status == 401) {
        document.getElementById("loginMsg").innerHTML = "Senha inválida";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-warning text-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");;
        document.getElementById("userPswrd").value = "";

    } else if (response.status == 404) {
        document.getElementById("loginMsg").innerHTML = "Usuário inválido";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-warning text-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");
        document.getElementById("userID").value = "";
        document.getElementById("userPswrd").value = "";

    } else {
        document.getElementById("loginMsg").innerHTML = "Erro desconhecido";
        document.getElementById("loginMsg").setAttribute("class", "alert alert-dangertext-center");
        document.getElementById("loginMsg").setAttribute("role", "alert");
    }

}

function executeLogin(user) {
    console.log(user);
    localStorage.setItem("UserData", JSON.stringify(user));
    window.location = "reports.html";
}