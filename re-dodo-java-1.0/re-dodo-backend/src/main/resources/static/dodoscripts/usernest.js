window.addEventListener("load", function(){

    document.body.style.visibility = "visible";

    const update = document.getElementById("update-interests");
    const more = document.getElementById("view-more");
    const goDodo = document.getElementById("goDodo");

    update.addEventListener("click", function(){
        window.location.replace("profilebuild");
    });

    more.addEventListener("click", function(){
        window.location.replace("");
    });

    goDodo.addEventListener("click", function(){
        window.location.replace("newdodo");
    });

});

