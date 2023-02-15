function primeNumber(n)
{
    if (n<2) {
        return false
    }
    for (let i = 0; i <=Math.sqrt(n); i++) {
       if (n % i === 0) {
         return false;
       }
    }
    return true;
}

console.log(primeNumber(1))
console.log(primeNumber(5))
console.log(primeNumber(8))