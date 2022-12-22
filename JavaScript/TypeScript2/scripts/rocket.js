export class Rocket {
    constructor(_rockertName, _totalCapacityKg) {
        this.rockertName = '';
        this.totalCapacityKg = 0;
        this.cargoItems = [];
        this.astronauts = [];
        this.rockertName = _rockertName;
        this.totalCapacityKg = _totalCapacityKg;
    }
    sumMass(items) {
        let sum = 0;
        items.forEach(e => {
            sum += e.massKg;
        });
        return sum;
    }
    currentMassKg() {
        return this.sumMass(this.astronauts) + this.sumMass(this.cargoItems);
    }
    canAdd(item) {
        if ((this.currentMassKg() + item.massKg) <= this.totalCapacityKg) {
            return true;
        }
        else
            return false;
    }
    addCargo(cargo) {
        if (this.canAdd(cargo)) {
            this.cargoItems.push(cargo);
            return true;
        }
        else
            return false;
    }
    addAstronaut(astronaut) {
        if (this.canAdd(astronaut)) {
            this.astronauts.push(astronaut);
            return true;
        }
        else
            return false;
    }
}
