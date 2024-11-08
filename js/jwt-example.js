const crypto = require("crypto");
const base64url = require("base64url");
// create an array of objects where each object represents a user
let users = [
    {
        username: "admin",
        password: "admin",
    },
    {
        username: "Duane",
        password: "matrix",
    },
];
const secretKey = "secretkey";




const authenticate = (username, password) => {
    // const user = users.find(
    //     (user) => user.username === username && user.password === password
    // );
    for(let i =0; i<users.length; i++){
        if(users[i].username === username && users[i].password === password){
            return users[i];
        }
    }
    return null;
};


const make_jwt = (username, password) => {
    let user = authenticate(username, password);
    if (!user) {
        return "Invalid username or password";
    }
    console.log("User is found to be:", user);
    const header = {
        alg: "HS256",
        typ: "JWT",
    };
    console.log("Header:", header);
    console.log("Header in JSON:", JSON.stringify(header));
    const encodedHeader = base64url.encode(JSON.stringify(header));
    console.log("Encoded Header:", encodedHeader);


    const payload = {
        sub: `${user.username}`,
        iat: Math.floor(Date.now() / 1000),
    };
    console.log("Payload:", payload);
    console.log("Payload in JSON:", JSON.stringify(payload));
    const encodedPayload = base64url.encode(JSON.stringify(payload));
    console.log("Encoded Payload:", encodedPayload);

    const message = `${encodedHeader}.${encodedPayload}`;
    console.log("Message:", message);

    const signature = crypto
        .createHmac("sha256", secretKey)
        .update(message)
        .digest("base64url");

    const jwt = `${encodedHeader}.${encodedPayload}.${signature}`;
    console.log("Encoded Header:", encodedHeader);
    console.log("Encoded Payload:", encodedPayload);
    console.log("Signature:", signature);
    console.log("JWT:", jwt);
    return jwt;
};


const verify_jwt = (token) => {
    const [encodedHeader, encodedPayload, providedSignature] = token.split(".");
    const message = `${encodedHeader}.${encodedPayload}`;
    const expectedSignature = crypto
        .createHmac("sha256", secretKey)
        .update(message)
        .digest("base64url");
    if (expectedSignature === providedSignature) {
        console.log("JWT is valid");
    } else {
        console.log("JWT is invalid");
    }
};

jwt = make_jwt("admin", "matrix");
console.log("JWT:", jwt);
// verify_jwt("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJhZG1pbiIsImlhdCI6MTczMTA4OTgzOH0.DXueqKkAkPUSGPjxF3u0FTwjYXivg7PXuQY3uPQwmts");

