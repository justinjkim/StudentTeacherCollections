package com.company;

import java.util.*;

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

        // Group1
        Set<Student> group1 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            group1.add(students.get(i));
        }
        //System.out.println(group1);

        // Group2
        Set<Student> group2 = new HashSet<>();
        for (int i = 5; i < 10; i++) {
            group2.add(students.get(i));
        }
        //System.out.println(group2);

        // Group3
        Set<Student> group3 = new HashSet<>();
        for (int i = 10; i < 15; i++) {
            group3.add(students.get(i));
        }
        //System.out.println(group3);


        Map<Teacher, Set> assignments = new HashMap<>();
        assignments.put(teachers.get(0), group1);
        assignments.put(teachers.get(1), group2);
        assignments.put(teachers.get(2), group3);


        //System.out.println(assignments);

        // testing out what keySet() and values() do...
//        System.out.println(assignments.keySet());
//        System.out.println(assignments.values());
        // looks like it literally just returns the keys and values respectively

        for (Teacher teacher : assignments.keySet()) {
            System.out.println(teacher);
            for (Set student : assignments.values()) {
                System.out.println(student);
            }
        }

        
    }
}
