const arr = [1, 2, 3, 'vishwas']
arr.push(4)     //to add an element in the end of the array
arr.unshift(0)  //To add an element at the beginning of the array
arr.pop()       //to remove item form the end 
arr.shift()     //To remove item from the beginning
console.log(arr[0]) //give the first element af the array!

for (const item of arr) {
    console.log(item)   //to print all items in the array
}


//Another method
/*
map: creates a new array from calling a function for every array element.
Filter: creates a new array filled with elements that pass a test provided by a function.
reduce: 
concat
slice
splice
*/

//Time complexity
/**
 Insert and remove from end - o(1)
 Insert and remove from the beginning - o(n)
 Access - o(1)
 Search - o(n)
 Push / pop - o(1)
 Shift / unshift /concat /Slice /splice - o(n)
 ForEach / map /filter /reduce - o(n)
 */


