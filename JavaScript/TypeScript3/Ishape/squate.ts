import { Ishape } from "./Ishape.js";

export class Square implements Ishape{

    side: number =0;

    constructor(_side:number){
        this.side=_side;
    }


    area(): number {
        
        return this.side * this.side ;

    }

    
}