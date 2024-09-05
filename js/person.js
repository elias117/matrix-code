let person = {
    "firstName": "Elias",
    "lastName": "Zoghaib",
    getFullName: function() {
        return this.firstName + " " + this.lastName;
    },
    setFullName: function(firstName, lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

let person2 = {
    "firstName": "Mikeal",
    "lastName": "Fowler",
    get fullName() {
        return this.firstName + " " + this.lastName;
    },
    set fullName(fullName) {
        let parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }
}

// let personFullName = person.getFullName();

// person.setFullName("John", "Doe");

// personFullName = person.getFullName();
// console.log(personFullName);


let person2FullName = person2.fullName;
console.log(person2FullName);

// person.setFullName("John", "Doe");
person2.fullName = "John Doe";

person2FullName = person2.fullName;
console.log(person2FullName);