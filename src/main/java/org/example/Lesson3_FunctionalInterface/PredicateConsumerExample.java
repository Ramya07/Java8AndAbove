package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumerExample {
    static void main(String[] args) {
    Consumer<Student> cs = student -> System.out.println(student.getName());
    Predicate<Student> ps = student -> student.getGradeLevel()>=3;

    List<Student> studentt = StudentMockObj.getAllStudents();

        studentt.forEach(
            student -> {
                if(ps.test(student))
                    cs.accept(student);
    }

);

    }
}
