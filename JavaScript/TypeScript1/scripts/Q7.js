"use strict";
var object = {};
let keys = [0, 1, 2];
let values = ["Java",
    "TypeScript", "JavaScript"];
for (let i = 0; i < keys.length; i++) {
    object[keys[i]] = values[i];
}
console.log(object);
