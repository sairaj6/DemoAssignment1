import { Ipayload } from "./Ipayload.js";
import { Astronaut } from "./astronaut.js";
import { Cargo } from "./cargo.js";

export class Rocket{
    rockertName:string='';
    totalCapacityKg:number = 0;
    cargoItems:Cargo[] = [];
    astronauts:Astronaut[] = [];

    constructor(_rockertName:string, _totalCapacityKg:number){
         this.rockertName = _rockertName;
         this.totalCapacityKg = _totalCapacityKg;
    }

    sumMass(items:Ipayload[]):number{

         let sum:number = 0
         items.forEach(e => {
              sum += e.massKg;
         });
         return sum;
    }

    currentMassKg():number{
         return this.sumMass(this.astronauts)+this.sumMass(this.cargoItems);
    }

    canAdd(item: Ipayload): boolean{

         if((this.currentMassKg() + item.massKg) <= this.totalCapacityKg)
         {
              return true;
         }
         else
         return false;
    }

    addCargo(cargo: Cargo): boolean
    {
         if(this.canAdd(cargo))
         {
              this.cargoItems.push(cargo);
              return true;
         }
         else 
              return false;
    }

    addAstronaut(astronaut: Astronaut): boolean{
         if(this.canAdd(astronaut))
         {
              this.astronauts.push(astronaut);
              return true;
         }
         else 
         return false;
    }
}