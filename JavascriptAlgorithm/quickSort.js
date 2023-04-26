function quickSort(array){
    if (array.lenght < 2) {
        return array;
    }
    let pivot = array[array.length -1 ]
    let left = []
    let right = []
    for (let i = 0; i < array.length; i++) {
        if (array[i] < pivot) {
            left.push(array[i])
        }
        else{
            right.push(array[i])
        }
    }
    return [quickSort(left), pivot, quickSort(right)]
}

//Big O = O(n^2) because we have the for loop here which increase the value of i so that we have quadratic time complexity