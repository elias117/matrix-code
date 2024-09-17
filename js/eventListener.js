const redButton = document.getElementById("red");
const blueButton = document.getElementById("blue");

const changeColor = (color) =>{
    // document.body.style.backgroundColor = color;
    document.getElementById("body").style.backgroundColor = color;
    document.title = "Foo";
}

redButton.addEventListener("click", () => {
    changeColor("red");
});

blueButton.addEventListener("click", () =>{
    changeColor("blue");
});
