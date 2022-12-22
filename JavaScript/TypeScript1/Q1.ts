let num: number = 1234;
var str:string = "";
let arr:number [] = [];
while(num>0){
    let rem = num % 10;
    num = Math.floor(num / 10);
    str += rem;
}

for(let i:number = 0; i<str.length; i++)
{
    arr.push(parseInt(str[i]));
}

for(let i:number = arr.length-1; i>=0; i--)
{
    console.log(arr[i]);
}

