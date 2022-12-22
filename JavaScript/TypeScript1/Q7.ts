interface LooseObject {
    [key: number]: any
}

var object: LooseObject = {};
  let keys = [0, 1, 2];
  let values :string[]= ["Java", 
    "TypeScript", "JavaScript"];
  for (let i:number = 0; i < keys.length; i++) {
    object[keys[i]] = values[i];
  }
  console.log(object);