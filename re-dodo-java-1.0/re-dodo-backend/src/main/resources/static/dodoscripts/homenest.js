window.addEventListener("load", function(){

    document.body.style.visibility = "visible";

});

window.addEventListener("DOMContentLoaded", function(){

    const enter_1 = document.getElementById("enterSite1");
    const enter_2 = document.getElementById("enterSite2")

    enter_1.addEventListener("click", function(){
        window.location.replace("login");
    });

    enter_2.addEventListener("click", function(){
            window.location.replace("login");
    });
});
