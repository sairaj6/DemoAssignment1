"use strict";
let str1 = "Hidd©©©en Ascii ©©®®®Charac££ter";
str1 = str1.replace(/[\u{0080}-\u{FFFF}]/gu, "_");
console.log(str1);
