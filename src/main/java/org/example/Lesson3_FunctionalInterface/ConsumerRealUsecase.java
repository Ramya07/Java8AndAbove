package org.example.Lesson3_FunctionalInterface;

import org.example.Model.Student;
import org.example.Model.StudentMockObj;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerRealUsecase {

    static Consumer<Student> c1 = student -> System.out.println(student);

    static Consumer<Student> name = student1 -> System.out.println(student1.getName());

    static Consumer<Student> activities = student -> System.out.println(student.getActivities());

    static void printNameAndActivitiesWithCondition(){
        List<Student> students = StudentMockObj.getAllStudents();
        students.forEach(student -> {
            if(student.getGpa()>=3)
                 name.andThen(activities).accept(student);
        });
    }

    static void printNameAndActivities(){
        List<Student> students = StudentMockObj.getAllStudents();
        students.forEach(name.andThen(activities));
    }
    static void main(String[] args) {
      printNameAndActivities();
        System.out.println("With Gpa: ");
        printNameAndActivitiesWithCondition();
    }
}
