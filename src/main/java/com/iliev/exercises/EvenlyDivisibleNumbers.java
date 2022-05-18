package com.iliev.exercises;
public class EvenlyDivisibleNumbers {
    public EvenlyDivisibleNumbers() {
    }

    public static int[] CalculateNumber(){

      boolean smallestFound = false;
      boolean biggestFound = false;
        int[] minAndMaxNumbers = new int[2];

        minNuber(smallestFound, minAndMaxNumbers);

        maxNubers(biggestFound, minAndMaxNumbers);

        return minAndMaxNumbers;
    }

    private static void minNuber(boolean smallestFound, int[] minAndMaxNumbers) {
        while (!smallestFound) {

            for (int i = 1; i < 500000000; i++) {
                boolean isDivisible = true;
                for (int j = 1; j < 20; j++) {
                    if (i % j != 0) {
                        isDivisible = false;
                        break;
                    }
                }
                if (isDivisible) {
                    smallestFound = true;
                    minAndMaxNumbers[0] = i;
                    break;
                }
            }
        }
    }

    private static void maxNubers(boolean biggestFound, int[] minAndMaxNumbers) {
        while (!biggestFound) {
            for (int i = 500000000; i > 2; i--) {
                boolean isDivisable = true;
                for (int j = 1; j < 20; j++) {
                    if (i % j != 0) {
                        isDivisable = false;
                        break;
                    }
                }
                if (isDivisable) {
                    biggestFound = true;
                    minAndMaxNumbers[1] = i;
                    break;
                }
            }
        }
    }
}
