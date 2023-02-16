function recursiveFibonacci(n){
    if( n < 2){
        return n
    }
    return  recursiveFibonacci(n-1)+ recursiveFibonacci(n-2)    //-->O(2^n) time complexity with is very far from O(n)
}