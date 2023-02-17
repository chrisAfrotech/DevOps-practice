function linearSearch(array, target){
    for (let i = 0; i < array.length; i++) {
        if (Array[i] === target) {
            return i;
        }
    }
    return -1;
}

//Big O = O(n)