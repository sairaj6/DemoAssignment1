import { Ipayload } from "./Ipayload.js";

export class Cargo implements Ipayload{
    massKg: number = 0;
    material:string = "";

    constructor(_massKg:number, _material:string){
         this.massKg = _massKg;
         this.material = _material;
    }

}