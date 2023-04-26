function towerOfHanoi(n, fromRod, toRod, usingRod) {
    if (n === 1) {
        console.log("move disk 1 from ${fromRod} to ${toRod});
        return
    }
    towerOfHanoi(n-1, fromRod, usingRod, toRod)
    console.log('Move disk ${n} from ${fromRod} to ${toRod}')
    towerOfHanoi(n-1, usingRod, toRod, fromRod)
}

towerOfHanoi(3, 'A', 'B', 'C')

/*For the function towerOfHanoi
Big O = O(n)
*/