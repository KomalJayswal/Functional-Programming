package net.learning.Functional.Programming.DeclarativeProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a list and filer even numbers from the list
 */
public class ProblemStatement1{
    /**
     * Imperative Programming
     */
    public void problem(){
        List<Integer> list = Arrays.asList(23, 44, 56, 22, 31, 45);

        List<Integer> evenList = new ArrayList<>();

        for (int i : list) {
            if (i % 2 == 0) {
                evenList.add(i);
            }
        }
        System.out.println(list);
        System.out.println(evenList);
    }

    /**
     * Declarative Programming
     */
    void solution(){

    }

    public static void main(String[] args) {
        problem();
        //solution();
    }
}

/*
Problem Statement 2 : https://www.geeksforgeeks.org/how-to-find-duplicate-elements-in-a-stream-in-java/

Problem statement 3 : create a (newlist of String) from an (exsisting List Of Object Model) using stream

        exsisting List Of Object Model Schema :-
        ObjectModelName[{
            private String field; //value = komal
        },{
            private String field; //value = manthan
        }]

Solution :-
        List<String> newlist = new ArrayList<>();
        newlist = exsistinglist.stream().map(ObjectModelName::field).collect(Collectors.toList());

Output :-
        newList :- [komal,manthan]

Problem statement 4 : create a (list of New Object Model) from an (exsisting List Of Object Model) using stream

        exsisting List Of Object Model Schema :-
        ExsistingObjectModelName[{
            private String name; //value = komal
        },{
            private String name; //value = manthan
        },
            private String name; //value = manthan
        }]

Solution :-
        List<ExsistingObjectModelName> exsistinglist = new ArrayList<>();
        List<NewObjectModelName> newlist = new ArrayList<>();

        newlist = exsistinglist.stream()
        .filter(p -> p.getField().equals("manthan"))
        .map(p -> new NewObjectModelName(p.getName(), "Vaishnav", 10))
        .collect(Collectors.toList());

Output:-
        NewObjectModelName[{
            private String name; //value = manthan
            private String surname; //value = Vaishnav
            private int rollNo; // value = 10
        },{
            private String name; //value = manthan
            private String surname; //value = Vaishnav
            private int rollNo; // value = 10
        }]

 */