package BigoNotation;

public class Main {
    public static void main(int[] numbers) {
        // O(2^n) < O(n^2) < O(n) < O(log n)
        //So that it can be define as:
        // CONSTANT: O(1)
        // LOGARITHMIC: O(log n)
        // LINEAR: O(n)
        // QUADRATIC: O(n^2)
        // Exponential: O(2^n)

        //O(1): constant time
//        System.out.println(numbers[0]);
        
        //O(2 + n) = O(n)
        System.out.println(); //O(1)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);     //O(n)
        }
        System.out.println();       //O(1);


        //O(n^2)
        for (int i = 0; i < numbers; i++) {     //O(n)
            for (int second : numbers) {
                System.out.println( i + " , " + second);     //O(n)
            }
        }


        // O(log n) When you reduce our work by a half in every step


        // O(2^n) exponential grow which is the opposite of the log n time

        //Space complexity


    }
}
