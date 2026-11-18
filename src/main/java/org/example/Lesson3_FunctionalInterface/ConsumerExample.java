package org.example.Lesson3_FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    static void main(String[] args) {
        Consumer consumer = (s)-> System.out.println(s);
        consumer.accept("test");
    }
}
