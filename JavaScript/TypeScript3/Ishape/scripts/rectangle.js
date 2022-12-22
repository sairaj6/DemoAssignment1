export class Rectangle {
    constructor(_length, _width) {
        this.length = 0;
        this.width = 0;
        this.length = _length;
        this.width = _width;
    }
    area() {
        return this.length * this.width;
    }
}
