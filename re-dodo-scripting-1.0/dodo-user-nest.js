function displayInterests(userInts){
    const interestsArr = userInts.split(',');
    const interestsDiv = document.querySelector("[data-interests]");

    const interestsList = document.createElement("ul");
    interestsDiv.appendChild(interestsList);

    for ( let i = 0; i < interestsArr.length; i++ ) {
        const showItem = document.createElement("li");
        showItem.textContent = interestsArr[i];
        interestsList.appendChild(showItem);

    };
    
};

window.addEventListener("load", function(e){

    const dodoBtn1 = document.getElementById("dodo-btn1");
    // const dodoBtn = document.querySelectorAll("#gogoDODO", "#gogoDODO2");
    const moreBtn = document.getElementById("view-more");
    const updateBtn = document.getElementById("update-interests");
    const dodoBtn2 = document.getElementById("gogoDODO2");
    const userInterests = localStorage.getItem("interests");

    displayInterests(userInterests);

    // dodoBtn.forEach(function(btn) {
    //     btn.addEventListener("click", function(e){
    //         window.location.href = "dodo-search.html";
    //     });
    // });

    dodoBtn1.addEventListener("click", function(e){
        window.location.assign("dodo-search.html");
    });

    dodoBtn2.addEventListener("click", function(e){
        window.location.assign("dodo-search.html");
    });

    moreBtn.addEventListener("click", function(click){
        window.location.assign("past-dodos.html");
    });

    updateBtn.addEventListener("click", function(click){
        window.location.assign("interests-update.html");
    });
});
