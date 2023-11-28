window.addEventListener("load", function(e){
    
    const ddData = {
        dodoUser: "",
        dodoPass: ""
    };

    const ddNew = {
        dodoUser: "",
        dodoPass: "",
        dodoEmail: "",
        dodoPhone: "",
        dodoBirth: "",
        dodoCoords: "",
    };

    // data
    const user = document.getElementById("username");
    const pass = document.getElementById("pass");
    const email = document.getElementById("email");
    const phone = document.getElementById("phone");
    const birth = document.getElementById("birth");
    const coords = document.getElementById("coords");

    // buttons
    const loginButton = document.getElementById("loginButton");
    const registerButton = document.getElementById("registerButton");


    // divs
    const visibleDiv = document.getElementById("visibleDiv");
    const regDiv = document.getElementById("registerDiv");
    const loginDiv = document.getElementById("loginDiv");

    // preventDefault();

    // listeners
    loginButton.addEventListener("click", function(e){
        e.stopPropagation();

        visibleDiv.outerHTML = loginDiv.outerHTML;

        const removeForm = document.getElementsByClassName("hiddenDiv2");
        // console.log(removeForm);

        removeForm[1].remove(document.getElementById("loginForm"));
        // console.log(removeForm);

        const goButton = document.getElementById("goButton");
        const backButton = document.getElementById("return-btn2");

        backButton.addEventListener("click", function(){

            window.location.replace("dodo-login-register.html");

        });

        goButton.addEventListener("click", function(e){
            
            ddData.dodoUser = document.querySelector("input[data-name]").value;
    
            ddData.dodoPass = document.querySelector("input[data-pass]").value;
    
            // console.log("ddData = " + ddData);
    
            localStorage.setItem("userAuth", JSON.stringify(ddData));

            // const userAuth = localStorage.getItem("userAuth");

            // console.log("userAuth = " + userAuth);

            // parseAuth = JSON.parse(userAuth);

            // console.log("parseAuth = " + parseAuth);
    
            window.location.replace("dodo-user-nest.html");
    
        });

    });

    registerButton.addEventListener("click", function(e){
        e.stopPropagation();
        visibleDiv.outerHTML = regDiv.outerHTML;

        const removeRegister = document.getElementsByClassName("hiddenDiv1");

        removeRegister[0].remove(document.getElementById("registerForm"));

        const submit = document.getElementById("submitRegistration");
        const backButton = document.getElementById("return-btn1");

        backButton.addEventListener("click", function(){

            window.location.replace("dodo-login-register.html");

        });

        submit.addEventListener("click", function(e){
    
            ddNew.dodoUser = document.querySelector("input[data-newName]").value;
            ddNew.dodoPass = document.querySelector("input[data-newPass]").value;
            ddNew.dodoEmail = document.querySelector("input[data-email]").value;
            ddNew.dodoPhone = document.querySelector("input[data-phone]").value;
            ddNew.dodoBirth = document.querySelector("input[data-birth]").value;
            ddNew.dodoCoords = document.querySelector("input[data-coords]").value;
    
            localStorage.setItem("newLogin", JSON.stringify(ddNew));

            console.log(ddNew);
    
            // const thisPage = "dodo-login-register.html"
            const nextPage = "new-user-profile-build.html";
            window.location.replace(nextPage);
    
        });

    });

});

