// System.out.println("Hello World");
console.log("Hello World");

// int x = 5;
// Primitive types of variables in javascript
Number, String, Boolean, Object, Undefined, Null;
let variable_number = 5.6; // number. Can be integer or float
variable_number = "foobar"; // changing the type of variable to string
let variable_string = "Hello World"; // string
let variable_boolean = true; // boolean
let variable_object = { elias: "32" }; // object
let variable_undefined = undefined; // undefined

// Arrays
// int[] x = new x[10];
let variable_array = [1, 2, 3, 4, 5]; // array
variable_array.push(6); // adding element to the array
variable_array.pop(); // removing element from the array

// Functions
// function add(a, b) {
//     return a + b;
// }

// using variables
let a = 5;
let b = 6;
let c = a + b;
console.log("The value of c is: " + c);
// formatted strings in javascript
console.log(`The value of c is: ${a + b}`);
console.log(
    `This is a formatted string. I can print any variable here. By using $ { } and placing the variable ${c}`
);

// if statements
if (c > 10) {
    console.log("The value of c is greater than 10");
} else if (c == 10) {
    console.log("The value of c is equal to 10");
} else {
    console.log("The value of c is less than 10");
}

// for loop
//   start;       end;  increment;
for (let i = 0; i < 10; i++) {
    console.log(`The value of i is: ${i}`);
}

// while loop
// start
let i = 0;
// end
while (i < 10) {
    console.log(`The value of i is: ${i}`);
    // increment
    i++;
}

// arrays example
let my_array = [1.0, 2.4, 3, 4.1234, 5, "elias", true];
my_array.push("Mikey"); // add to end of array
// console.log(my_array);
my_array.pop(); // remove from end of array
my_array.shift(); // remove from start of array
console.log(my_array);
console.log(my_array[3]);
console.log(my_array.at(-4));
let length_of_array = my_array.length;

// function examples
function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}
// creating arrow function
let multiply = (a, b) => {
    return a * b;
};

// calling the function
let answer = add(5, 6);
console.log(`The value of 5 + 6 is: ${answer}`);

// object example
let my_object = {
    // key: value,
    name: "Elias",
    age: 32,
    is_student: true,
    grades: [90, 80, 70, 60],
    address: {
        street: "123 Main St",
        city: "New York",
        state: "NY",
        zip: 10001,
    },
};

console.log(
    `The name of the person is: ${my_object.name} and the age of the person is ${my_object.age}`
);
console.log(`The first grade of the person are: ${my_object.grades[0]}`);
console.log(my_object.grades);
console.log(`The street of the person is: ${my_object.address.city}`);
console.log(my_object.address.zip);
