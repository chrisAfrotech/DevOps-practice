function insertionSort(array) {
    for (let i = 1; i < array.length; i++) {    //use to iterate the unsorted part of the array
        let nti=array[i]    //innittialise i to the first element
        let j = i-1     //innitialise j to the element before i
        while (j>=0 && array[j] > nti) { //we compare the sort element of the array with the nti 
            array[j+1] = array[j]
            j = j-1
        }
        array[j+1] = nti //we insert the number to the right of the index
    }
}

//Big O = O(n^2) because we have two loop here the while loop nested inside the for loop and the number of comparism increase by square of the number so here we are in the case of Quadratic time complexity. 