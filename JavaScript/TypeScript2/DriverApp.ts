import { Astronaut } from "./astronaut.js";
import { Cargo } from "./cargo.js";
import { Rocket } from "./rocket.js";

let cargo =  new Cargo(20,"food");
let cargo1 =  new Cargo(200,"water");
let astronaut = new Astronaut(105,"sairaj");
let astronaut1 = new Astronaut(80,"prajot");

let rocket = new Rocket("Apollo-16", 600);

console.log(rocket.addAstronaut(astronaut));
console.log(rocket.addCargo(cargo));

console.log(rocket);


console.log(rocket.addAstronaut(astronaut1));
console.log(rocket.addCargo(cargo1));

console.log(rocket);





























