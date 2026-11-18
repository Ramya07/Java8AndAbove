package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateRealUsecase {
    static void main(String[] args) {
        BiPredicate<Integer, Double> bip = (grade, gpa) -> grade >=3 && gpa >=3;
        BiConsumer<String, List<String>> stud = (name, act) -> System.out.println(name+" : "+act);

        List<Student> students = StudentMockObj.getAllStudents();

        students.forEach(student -> {
            if(bip.test(student.getGradeLevel(), student.getGpa()))
                stud.accept(student.getName(), student.getActivities());
        });

    }
}
