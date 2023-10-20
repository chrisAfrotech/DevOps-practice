package ControlFlow;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*******comparaison operators**********/
//        int x = 1;
//        int y = 1;
//        System.out.println( x!=y );

        //**************logical operators****************
//        int temparature = 10;
//        boolean isWarm = temparature > 20 && temparature < 30;
//        System.out.println(isWarm);

//        boolean hasGoodIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasGoodIncome || hasGoodCredit) && hasCriminalRecord;
//        System.out.println(isEligible);

        //**************Simplifying IF statement*******************
//        int income = 420_000;
//        boolean hasHighIncome = (income > 100_000);
//
//        System.out.println(hasHighIncome);

        //**************If statement***************
//        byte temparature = 28;
//        if (temparature > 30) {
//            System.out.println("It's a hot day, Drink plenty of water");
//        } else if (temparature > 20 ) {
//            System.out.println("It's a nice day");
//        }else{
//            System.out.println("It's a cold day");
//        }

        //******************Switch statement************
//            String role = "tester";
//
//            switch (role){
//                case "admin":
//                    System.out.println("you're an admin");
//                    break;
//                case "moderator":
//                    System.out.println("you're a moderator");
//                    break;
//                default:
//                    System.out.println("you're a guest");
//            }

//            if (role == "admin")
//                System.out.println("you're an admin");
//            else if (role == "moderator") {
//                System.out.println("you're a moderator ");
//            }
//            else
//                System.out.println("you're a guest");

        //*********************Ternary expression************/
//            int income = 120_000;
//            String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);

        //Exercise FIZZBUZZ
//       if number divisible by 5)
//        result: FIzz
//      if number divisible by 3
//          result: buzz
//        if divisible by 3 and 5
//            result fizzbuzz
//        if not divisible by 3 and 5
//        result: number

        System.out.println("***********FIZZBUZZ GAME***********");
        final byte dividerFive = 5;
        final byte dividerThree = 3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        byte number = sc.nextByte();

        if ((number % dividerThree == 0) && (number % dividerFive == 0)) {
            System.out.println("FIZZBUZZ");
        }else if ( (number % dividerFive) == 0 ) {
            System.out.println("FIZZ");
        } else if ((number % dividerThree) == 0) {
            System.out.println("BUZZ");
        } else
            System.out.println(number);


    }
}
