function climbingStaicase(n) {
    const noOfWays = [1, 2]     //those are the unique possibility to climb from one level to another
    for (let i = 2; i < n; i++) {
        noOfWays[i] = noOfWays[i-1] + noOfWays[i-2]     //way we can climb for more than one level
    }
    
    return noOfWays[n-1]
}

/*For the function climbing Staircase
Big O = O(n) because we have only onr for loop here!
*/