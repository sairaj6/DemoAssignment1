import { Ishape } from "./Ishape.js";


export class Rectangle implements Ishape{

    length: number = 0;
    width: number = 0;

    constructor(_length:number, _width:number){
        this.length =_length;
        this.width = _width;
    }


    area(): number {
        
        return this.length * this.width ;

    }

    
}