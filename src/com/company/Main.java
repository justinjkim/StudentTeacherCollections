package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            students.add(new Student("Student" + String.valueOf(i), "Kim", i));
        }

        List<Teacher> teachers = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            teachers.add(new Teacher("Teacher" + String.valueOf(i), "Lee", i));
        }

        System.out.println(students);
        System.out.println(teachers);
    }
}
