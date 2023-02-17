function binarySearch(array, target){
    let leftIndex=0;
    let rightIndex=array.length-1;

    while (leftIndex <= rightIndex) {
        let middleIndex = Math.floor((leftIndex+rightIndex)/2);
        if (target === array[middleIndex]) {
            return middleIndex;
        }
        if (target < array[middleIndex]) {
            rightIndex = middleIndex - 1;       //At every iteration as here we reduce the time complexity by two
        }
        else{
            leftIndex = middleIndex + 1;
        }
    }
    return -1;
}

//Big O = log(n) because the evolution of n is divided at each time