package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerRealUsecase {

    static void main(String[] args) {
      BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ":" + activities);

      List<Student> students = StudentMockObj.getAllStudents();
      students.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }
}
