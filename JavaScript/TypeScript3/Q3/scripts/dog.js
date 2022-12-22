export class Dog {
    constructor() {
        this.bodyTemp = 0;
    }
    setBodyTemp(temp) {
        this.bodyTemp = temp;
    }
    saySomething() {
        return "Dog says Bow Wow..";
    }
    getBodyTemp() {
        return this.bodyTemp;
    }
}
