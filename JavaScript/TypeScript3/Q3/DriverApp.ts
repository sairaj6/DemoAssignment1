import { Cat } from "./cat.js";
import { Dog } from "./dog.js";

let cat:Cat=new Cat();
let dog:Dog=new Dog();

console.log(cat.saySomething());
console.log(dog.saySomething());
cat.setBodyTemp(30);
dog.setBodyTemp(25);
console.log(cat.getBodyTemp());
console.log(dog.getBodyTemp());