window.addEventListener("load", function(e){

    const saveBtn = document.getElementById("saveInterests");
    const resetBtn = document.getElementById("reset");
    const allInterests = document.querySelectorAll("input[data-interest]");
    const interestArray = [];

    allInterests.forEach(function(input){
        input.addEventListener("click", function(e){

            const selection = e.currentTarget;
            const interestId = selection.getAttribute("id");

            if(interestArray.includes(interestId)){
                const cut = interestArray.indexOf(interestId);
                interestArray.splice(cut, 1);
                console.log(interestArray);
                return interestArray;
            } else {
                interestArray.push(interestId);
                console.log(interestArray);
                return interestArray;
            };
        });
    });

    resetBtn.addEventListener("click", function(){
        interestArray.splice(0);
        console.log(interestArray);
    })

    saveBtn.addEventListener("click", function(e){
        localStorage.setItem("interests", interestArray);
        window.location.assign("dodo-user-nest.html");
    });

})
