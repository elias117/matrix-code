let settings = {
    volume: 70,
    theme: "High",
};

// can't change the settings object cant add or delete or change the properties
Object.freeze(settings);

settings.volume = 90;
settings.language = "English";
delete settings.brightness;


let string = "Settings: " + settings;
console.log("Settings: ", settings);
// console.log("a: ", 1, "b: ", 2, "c: ", 3);


console.log(`settings: ${settings}`);
console.log(`${settings.theme}`);
console.log("Settings: " + settings);
console.log(settings);
console.log("Settings: ", settings);
