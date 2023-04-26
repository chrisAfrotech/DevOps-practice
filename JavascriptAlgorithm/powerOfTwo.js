function powerOfTwo(n){
    if (n < 1) {
        return false
    }
    while (n > 1){
        if (n % 2 !== 0) {  
            return false
        }
        n = n/2            //--> O(log(n)) because n is divided by two each times 
    }
    return true;
} 