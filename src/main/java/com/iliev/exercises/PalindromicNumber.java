package com.iliev.exercises;
import java.util.*;

public class PalindromicNumber {
    public PalindromicNumber() {
    }
    public static int FindPalindromicNumber() {

        List<Integer> palindromeNumbers = new ArrayList<>() {
        };
        for (int i = 2; i < 999; i++) {
            for (int j = 2; j < 999; j++) {

                String sumIntString = Integer.toString(i * j);
                StringBuilder builder = new StringBuilder();

                for (int k = sumIntString.length() - 1; k >= 0; k--) {
                    builder.append(sumIntString.charAt(k));
                }

                String reversedNumbers = builder.toString();

                if (reversedNumbers.equals(sumIntString) && reversedNumbers.length() >= 2) {
                    palindromeNumbers.add(Integer.parseInt(sumIntString));
                }
            }
        }
        int num = Collections.max(palindromeNumbers);

        return num;
    }
}
