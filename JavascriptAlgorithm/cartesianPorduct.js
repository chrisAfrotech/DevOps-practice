function cartesianProduct(array1, array2) {
    const result = []
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            result.push([array1[i], array2[j]])     //For each element in the first array, pairing with the second element in the second array then the pair is push in the array result
        }
        
    }

    return result
}

/* For the function cartesian product  
Big O = O(n/m)) because we have two  nested for loop and specifically here the two arrays have different lenght n for the first and m for the second
*/