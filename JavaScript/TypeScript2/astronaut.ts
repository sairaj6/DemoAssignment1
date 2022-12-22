import { Ipayload } from "./Ipayload.js";


export class Astronaut implements Ipayload{
     massKg: number = 0;
     name:string = "";

     constructor(_massKg:number, _name:string){
          this.massKg = _massKg;
          this.name = _name;
     }

}






