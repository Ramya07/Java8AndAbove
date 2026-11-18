package org.example.Model;

import java.util.List;

public class Student
{
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private List<String> activities;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this. activities = activities;
    }
    public String getGender() {return gender;}
    public void setGender(String gender) { this.gender = gender;}
    public double getGpa() {return gpa;}
    public void setGpa(double gpa) { this.gpa = gpa;}
    public String getName() {return name;}
    public void setName(String name) { this.name = name;}
    public int getGradeLevel() {return gradeLevel;}
    public void setGradeLevel(int gradeLevel){ this.gradeLevel = gradeLevel;}
    public void setGender(int gradeLevel) { this.gradeLevel = gradeLevel;}
    public List<String> getActivities(){
        return activities;
    }
    public void setActivities(List<String> activities)
    {
        this.activities = activities;
    }

    @Override
    public String toString(){
        return "Student ->"+ "name: " + name +" \n"+
                             "gender: " + gender + " \n"+
                             "gpa: " + gpa +" \n"+
                             "gradelevel: " + gradeLevel + " \n"+
                             "activities: " + activities;
    }
}
