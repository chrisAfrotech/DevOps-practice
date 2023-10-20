package tp1MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Project:
        // Build a mortgage calculator
        //1. What is the amount of loan you want to get (eg: 100000) "P"
        //2. Annual interest rate (eg: 3.92%) "r"
        //3. Period of mortgage (eg: 30 years) "n"
        //4. Calculate the MORTGAGE: "M"

//        M = p((r(1+r)^n) / ((1+r)^n)-1)
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("************Mortgage calculator***************\n");

        System.out.print("1. What is the principal amount you want to loan? ");
        int principal = scanner.nextInt();

        System.out.print("2. What is the annual interest rate? ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("3. Which Period of mortgage do you need? (in YEARS)");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        Double mortgage = principal
                *(monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                /(Math.pow(1+monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageFormatted );

//        r=r*12
//        M = p((r(1+r)^n) / ((1+r)^n)-1);
//
//        System.out.println(M);


        //nb: Avoid magic number in your code just use constant to reference it or variables
        // Always use descriptive name in the code to manipulate our code, avoid the using of name as m1. ml or non sense name


    }
}
