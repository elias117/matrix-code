let myArray = [["This", "is", "a nested", "array"], "World", "JavaScript"];

// let anotherArray = myArray[0]; // anotherArray = ["This", "is", "a nested", "array"]
// console.log(anotherArray[2]); 


let myObject = {
    name: "JavaScript",
    age: 25,
    isAwesome: true,
    myFavouriteThing: "Programming",
    creator: {
        author: "Brendan Eich",
        year: 1995,
        company: "Netscape",
        isAlive: true,
    }
};

// console.log(myObject.name); // JavaScript
// console.log(myObject["age"]); // 25
// console.log(myObject[myFavouriteThing]); // Programming
// console.log(myObject.myFavouriteThing); // SyntaxError: Unexpected string

// console.log(myObject.creator.author); // Brendan Eich
// console.log(myObject.creator);
myObject.program = "Netscape";
// console.log(myObject);

console.log(myObject.program); // Netscape
