package com.iliev.exercises;

public class fibonacci {
    private static long[] fibonacciNumbers;

    public fibonacci() {
    }
    public static long getFibonacciSum(int number) {
        long sum = 0;
        fibonacciNumbers = new long[number + 1];
        calculateFibonacci(number);

        for (long element : fibonacciNumbers) {
            if (element % 2 != 0 && element < 2000000) {
                sum += element;
                System.out.print(element + " ");
            }
        }
        return sum;
    }

    private static long calculateFibonacci(int n) {

        if (n <= 1) {
            return n;

        }
        if (fibonacciNumbers[n] != 0) {
            return fibonacciNumbers[n];
        }


        long currentNumber = (calculateFibonacci(n - 1) + calculateFibonacci(n - 2));
        fibonacciNumbers[n] = currentNumber;

        return currentNumber;
    }
}
