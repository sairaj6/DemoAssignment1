"use strict";
let array = ["hello", "world", "hii"];
function find(str) {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === str) {
            return true;
        }
    }
    return false;
}
console.log(find("hii"));
