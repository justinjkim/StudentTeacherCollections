package com.company;

public class Teacher {
    String firstName;
    String lastName;
    int id;
    int grade;

    public Teacher(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = 1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (id != teacher.id) return false;
        if (grade != teacher.grade) return false;
        if (firstName != null ? !firstName.equals(teacher.firstName) : teacher.firstName != null) return false;
        return lastName != null ? lastName.equals(teacher.lastName) : teacher.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + id;
        result = 31 * result + grade;
        return result;
    }
}
