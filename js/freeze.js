let elias = {
    "name": "elias",
    "age": 25,
    "isAwesome": true,
    "myFavouriteThing": "Programming",
};

const mikey = {
    "name": "mikey",
    "age": 25,
    "isAwesome": true,
    "myFavouriteThing": "Programming",
};

const weather = {
    "temperature": 25,
    "humidity": 0.5,
    "isRaining": false,
    "location": "Toronto",
};
Object.freeze(weather);


// copy the weather object
copyOfWeather = {
    "temperature": weather.temperature,
    "humidity": weather.humidity,
    "isRaining": weather.isRaining,
    "location": weather.location
}

// alternative way to copy an object
let copyOfWeather = { ...weather };


let objectA = {"a": 1, "b": 2};
let objectB = {"c": 3, "b": 52};

// let c = {
//     "a": objectA.a,
//     "b": objectA.b,
//     "c": objectB.c,
//     "b": objectB.b
// }

let c = {...objectA, ...objectB};
console.log(c);




console.log(weather);
console.log(copyOfWeather);




Object.freeze(elias);
Object.freeze(mikey);


console.log(mikey);

console.log("Changing favorite thing to JavaScript");
mikey.myFavouriteThing = "JavaScript";

console.log(mikey);
