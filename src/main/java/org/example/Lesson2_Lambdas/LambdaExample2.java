package org.example.Lesson2_Lambdas;

import java.util.Comparator;

public class LambdaExample2 {
    static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(200,20));

        Comparator<Integer> c = (x1,x2)-> x1.compareTo(x2);
        System.out.println(c.compare(2,200));
    }
}
