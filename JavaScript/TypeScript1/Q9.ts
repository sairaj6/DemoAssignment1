let arr1:number [] = [12,23,43,56,7];
 
// Function to calculate the average of numbers
function avg(arr:number[]) {
  var sum = 0;

  // Iterate the elements of the array
  arr.forEach(function (item, idx) {
    sum += item;
  });

  // Returning the average of the numbers
  return sum / arr.length;
}
console.log("Average of array is: "+avg(arr1));