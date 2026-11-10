package org.example.Lesson1_ImpVsDec;

import java.util.stream.IntStream;

public class ImperativeVSDeclarative {
    public static void main(String s[]){
        //Imperative
        int sum=0;
        for(int i=0;i<=100;i++)
            sum+=i;
        System.out.println(sum);
        //Declarative
        System.out.println("Declarative: " + IntStream.rangeClosed(0,100).sum());

    }
}
