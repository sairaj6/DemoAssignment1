"use strict";
let num = 1234;
var str = "";
let arr = [];
while (num > 0) {
    let rem = num % 10;
    num = Math.floor(num / 10);
    str += rem;
}
for (let i = 0; i < str.length; i++) {
    arr.push(parseInt(str[i]));
}
for (let i = arr.length - 1; i >= 0; i--) {
    console.log(arr[i]);
}
