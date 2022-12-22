import { MainArea } from "./mainArea.js";
import { Rectangle } from "./rectangle.js";
import { Square } from "./squate.js";

let squareArea: Square = new Square(10);
let rectangleArea:Rectangle = new Rectangle(10,5);

let result:MainArea = new MainArea();

console.log("Area of Square "+ result.calculateArea(squareArea));

console.log("Area of Rectangle "+ result.calculateArea(rectangleArea));