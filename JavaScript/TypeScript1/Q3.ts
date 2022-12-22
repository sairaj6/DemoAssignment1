let array:string[]=["hello","world","hii"];
function find(str:string)
{
    for(let i:number=0;i<array.length;i++)
    {
        if(array[i]===str)
        {
            return true;
        }
    }
    return false;
}
console.log(find("hii"));