package org.example.core;

public class StringImmutable {

    static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;
        s1 = s1 + " Programming";
        System.out.println(s1);
        System.out.println(s2);
    }

    /*
    Reason	            Explanation
    Security	        Prevents unexpected modification of sensitive data
    Thread Safety	    Allows safe sharing across multiple threads
    String Pool	        Enables object reuse and saves memory
    HashCode Caching	Keeps hashCode consistent and allows caching
     */
}
