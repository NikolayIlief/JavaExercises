package com.iliev.exercises;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = DividedByNum.sumNumbers(n);
        System.out.println(sum);

        long fibonacciSum = fibonacci.getFibonacciSum(n);
        System.out.println(fibonacciSum);

        int nthPrimeNumber = CalculatePrimeNumber.FindPrimeNumber(n);
        System.out.println(nthPrimeNumber);

        int maxPalindromeNumber = PalindromicNumber.FindPalindromicNumber();
        System.out.println(maxPalindromeNumber);

        int minDivisableNumbers = EvenlyDivisibleNumbers.CalculateNumber()[0];
        int maxDivisableNumbers = EvenlyDivisibleNumbers.CalculateNumber()[1];
        System.out.println("Minimum number: " + minDivisableNumbers + ", maximum number: " + maxDivisableNumbers);
    }
}
