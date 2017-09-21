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

        System.out.println(students);
    }
}
