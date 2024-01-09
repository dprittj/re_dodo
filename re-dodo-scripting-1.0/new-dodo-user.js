window.addEventListener("DOMContentLoaded", function(load){

    const submit = document.getElementById("submit");

    // const login = localStorage.getItem("login");

    const credentials = localStorage.getItem(JSON.parse("login"));
    console.log(credentials);

    const user = document.getElementById("username");
    const pass = document.getElementById("pass");
    const email = document.getElementById("email");
    const phone = document.getElementById("phone");
    const dob = document.getElementById("birth");
    const location = document.getElementById("coords");
    const userDetails = {
        UserCredentials: "",
        userEmail: "",
        userPhone: "",
        userDOB: "",
        userLocation: ""
    };

    submit.addEventListener("click", function(e){

        userDetails.UserCredentials = credentials;
        userDetails.userEmail = email.value;
        userDetails.userPhone = phone.value;
        userDetails.userDOB = dob.value;
        userDetails.userLocation = location.value;

        const sendDetails = localStorage.setItem("userDetails", userDetails);

        const nextPage = "dodo-search.html";
        window.location.href.assign(nextPage);
    })
});
