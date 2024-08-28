const readline = require("readline");

const rl = readline.createInterface({
    // key: value,
    output: process.stdout,
    input: process.stdin
});


rl.question("What is your name? ", function (name) {
    rl.question(`Hello ${x} what is your age? `, function (age) {
        console.log(`Hello ${name}, you are ${age} years old`);
        rl.close();
    });
});

// let point_x = -2;
// let point_y = -3;

// if (point_x > 0 && point_y > 0) {
//     console.log("The point is in the first quadrant");
// } else if (point_x < 0 && point_y > 0) {
//     console.log("The point is in the second quadrant");
// } else if (point_x < 0 && point_y < 0) {
//     console.log("The point is in the third quadrant");
// } else if (point_x > 0 && point_y < 0) {
//     console.log("The point is in the fourth quadrant");
// }
