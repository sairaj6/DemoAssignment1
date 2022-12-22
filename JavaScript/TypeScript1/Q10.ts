function colorHelper(color:number,data:string)
{  
  
   /* function receives 2 arguments color and data*/
   const black = "\x1b[30m";  
   const red = "\x1b[31m";
   const green = "\x1b[32m";
   const yellow = "\x1b[33m";
   const blue = "\x1b[34m";
   const magenta = "\x1b[35m";
   const cyan = "\x1b[36m";
   const white = "\x1b[37m";
   const arr=[];
  
   /* Storing the color codes in Array */
   arr[0] = black;  
   arr[1] = red;
   arr[2] = green;
   arr[3] = yellow;
   arr[4] = blue;
   arr[5] = magenta;
   arr[6] = cyan;
   arr[7] = white;
   console.log(arr[color]+data);
}
  
/* colorHelper function called with color and data */
colorHelper(1,"I am Red");  
colorHelper(2,"I am Green");
colorHelper(5,"I am Magenta");