package org.example.Model;

import java.util.Arrays;
import java.util.List;

public class StudentMockObj {

    public static List<Student> getAllStudents(){
        Student student1 = new Student("Maya",4,4,"Female", Arrays.asList("gymnastics","tamil"));
        Student student2 = new Student("Rudra",7,4,"Male", Arrays.asList("cricket","rsm","tamil"));

        return Arrays.asList(student1,student2);
    }
}
