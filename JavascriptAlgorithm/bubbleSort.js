function bubbleSort(array) {
    let swapped;
    do{ //check if the element are swapped
        swapped = false
        for (let i = 0; i < array.length; i++) {   //use to iterate each value of the array
            if (array[i] > array[i+1]) {
                let temp = array[i]
                array[i] = array[i+1]
                array[i+1] = temp   //to make permutation of actual element and the next element
                swapped = true;    
            }
        }  
    }while(swapped)
}

//Big O = O(n^2) because we have two loop here the DoWhile loop which conatain a for loop and the number of comparism increase by square of the number so here we are in the case of Quadratic time complexity.
