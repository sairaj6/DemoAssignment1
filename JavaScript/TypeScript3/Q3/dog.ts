import { MyAnimals } from "./myanimals.js";

export class Dog implements MyAnimals{
    bodyTemp: number=0;
    setBodyTemp(temp: number): void {
        this.bodyTemp=temp;
    }
    saySomething(): string {
        return "Dog says Bow Wow..";
    }
    getBodyTemp(): number {
        return this.bodyTemp;
    }
    
}