function factorial(n){
    let result = 1;
    for (let i = 0; i <=n; i++) {
        result = result * i;        //--> O(n) time complexity
    }
    return result;
}