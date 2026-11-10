package org.example.Lesson1_ImpVsDec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVSDeclarative1 {
    public static void main(String s[]){
        //Imperative
        List<Integer> num = Arrays.asList(1,3,1,3,4,5);
        List<Integer> num1 = new ArrayList<>();
        for(Integer integer:num){
            if(!num1.contains(integer))
                num1.add(integer);
        }
        System.out.println("Imperative way of removing duplicates: "+num1);

        System.out.println("Declarative way of removing duplicates: "+num.stream().distinct().collect(Collectors.toList()));



    }
}
