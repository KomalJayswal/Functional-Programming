package net.learning.Functional.Programming.DeclarativeProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Learning1 {

    /**
     * Three ways to create a list
     */
    public static void main(String[] args){

        List<Integer> list1 = List.of(2,4,50,21,22,24);

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(33);
        list2.add(65);

        List<Integer> list3 = Arrays.asList(23,44,56,22,31,45);

    }
}
