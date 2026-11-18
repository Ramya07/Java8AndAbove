package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;

public class FunctionRealUsecase {

    static void main(String[] args) {
        Function<String, String> function = (name) -> name.toUpperCase();
        Function<String, String> add = (name) -> name.concat(" There");

        System.out.println(function.apply("hi"));
        System.out.println(function.andThen(add).apply("hi"));
        System.out.println(function.compose(add).apply("hi"));


        Function<List<Student>, Map<String, Integer>> studMap = studentList -> {
            Map<String, Integer> studcopy = new HashMap<>();
            studentList.forEach(student -> {
                if(PredicateRealUseCase.p1.test(student))
                    studcopy.put(student.getName(), student.getGradeLevel());
            });

            return studcopy;
        };

        System.out.println(studMap.apply(StudentMockObj.getAllStudents()));

    }
}
