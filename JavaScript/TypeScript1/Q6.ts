const over = (...fns:any[]) => (...args:any[]) => 
fns.map(fn => fn.apply(null, args));

const minMax = over(Math.min, Math.max);

console.log(minMax(11,12,-99,24)); 
console.log(minMax(33,-10, 1, 0, 19)); 
console.log(minMax(0, 1, 2, 3, 4));