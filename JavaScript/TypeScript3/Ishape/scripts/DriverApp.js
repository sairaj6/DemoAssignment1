import { MainArea } from "./mainArea.js";
import { Rectangle } from "./rectangle.js";
import { Square } from "./squate.js";
let squareArea = new Square(10);
let rectangleArea = new Rectangle(10, 5);
let result = new MainArea();
console.log("Area of Square " + result.calculateArea(squareArea));
console.log("Area of Rectangle " + result.calculateArea(rectangleArea));
