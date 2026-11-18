package org.example.Lesson2_Lambdas;

public class LambdaExample {
   public static void main(String s[]) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("Inside Runnable");
           }
       };
       new Thread(runnable).start();


       Runnable runnable1 = () -> System.out.println("lambda example");
       new Thread(runnable1).start();
   }
}
