function validateUserSession() {
    var user = localStorage.getItem("UserData");
    
    if (!user) {
        window.location = "index.html";
    }
}