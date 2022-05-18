package com.iliev.exercises;

public class CalculatePrimeNumber {

    private CalculatePrimeNumber() {
    }


    public static int FindPrimeNumber(int nthNumber) {
        int counter = 0;
        int numToCheck = 1;
        boolean isFound = false;

        while (!isFound) {
            numToCheck++;
            boolean isPrime = true;
            for (int i = 2; i <= numToCheck / 2; i++) {
                if (numToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter++;
                if (counter ==  nthNumber){
                    isFound = true;
                }
            }

        }
        return numToCheck;
    }
}
