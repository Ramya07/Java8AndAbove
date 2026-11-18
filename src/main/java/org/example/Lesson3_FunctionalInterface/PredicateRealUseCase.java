package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.List;
import java.util.function.Predicate;

public class PredicateRealUseCase {

    static Predicate<Student> p1 = student -> student.getGpa()>=3;
    static Predicate<Student> p2 = student -> student.getGradeLevel()>=2;
    static void main(String[] args) {

        List<Student> students = StudentMockObj.getAllStudents();
        students.forEach(student -> {
            if(p1.and(p2).test(student)) System.out.println(student);
        } );

    }
}
