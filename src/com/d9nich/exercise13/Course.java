package com.d9nich.exercise13;

public class Course implements Cloneable {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        String[] enrolledStudents = new String[numberOfStudents];
        System.arraycopy(students, 0, enrolledStudents, 0, numberOfStudents);
        return enrolledStudents;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int position = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (student.equals(students[i])) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            numberOfStudents--;

            if (numberOfStudents - position >= 0)
                System.arraycopy(students, position + 1, students, position, numberOfStudents - position);
        }
    }

    public void clear() {
        numberOfStudents = 0;
    }

    @Override
    public Object clone() {
        try {
            Course clone = (Course) super.clone();
            clone.students = students.clone();
            return clone;
        } catch (CloneNotSupportedException ex) {
            System.out.println("Clone not allowed");
        }
        return null;
    }
}
