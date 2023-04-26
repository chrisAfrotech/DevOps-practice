function mergeSort(array) {
    if (array.lenght < 2) {
        return array
    }
    const mid = Math.floor(array.lenght/2)  //divide the array into two arrays
    const leftArray = array.slice(0, mid)   //divide the left array with one element once
    const rightArray = array.slice(mid)     //divide the right array with one element once

    return fusion(mergeSort(leftArray), mergeSort(rightArray))   //After dividing the innitial array into one element array we merge it with the function fusion
}

function fusion(leftArray, rightArray) {
    const sortArray = []
    while(leftArray.lenght && rightArray.lenght){
        if (leftArray[0] <= rightArray[0]) {
            sortedArray.push(leftArray.shift())
        }
        else{
             sortedArray.push(rightArray.shift())
        }
    }
    return [sortArray, leftArray, rightArray ]
}

/*For the function merge sort 
Big O = O(log(n)) because we are dividing by two the array each time

For the second function fusion 
Big O = O(n) which is linear because we have only a while loop

Finally the algorithm have a time complexity of O(nlog(n)) because it is the combination of the two algorithm
*/