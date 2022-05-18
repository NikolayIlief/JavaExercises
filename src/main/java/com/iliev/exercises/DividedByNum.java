package com.iliev.exercises;
import java.util.ArrayList;
import java.util.List;

public class DividedByNum {

    public DividedByNum() {
    }


    public static long sumNumbers(int number){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                numbers.add(i);
            }
        }
        return (long) numbers.stream().reduce(0, Integer::sum);
    }
}
