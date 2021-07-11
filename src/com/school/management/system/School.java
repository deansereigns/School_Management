package com.school.management.system;

import java.util.List;

public class School {
    private List<Teachers> teachers; // List Storing the Records of Teachers in the School
    private List<Students> students; // List Storing the Records of Student in the School
    private static int  total_Money_Earned; // Money Earned By the School. Initially 0
    private static int total_Money_Spent;// Money Spent By the School. Initially 0

    public School(List<Teachers> teachers, List<Students> students) {
        this.teachers = teachers;
        this.students = students;
        total_Money_Earned = 0;
        total_Money_Spent = 0;
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }
    // Return the List of Teachers
    public List<Students> getStudents() {
        return students;
    }
    // Return the list of Student

    public void addStudent(Students student) {
        students.add(student);
    }
    // Method to add a new student

    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }
    // Method to add a new Teacher


    public static int getTotal_Money_Earned() {
        return total_Money_Earned;
    }
    // Return Net Money Earned By School

    public static int getTotal_Money_Spent() {
        return total_Money_Spent;
    }
    // Return Money Spent by School

    public static void updateMoneyEarned(int MoneyEarned) {
        total_Money_Earned += MoneyEarned;
    }
    // method to update the Money Earned by the School

    public static void updateMoneySpent(int moneySpent) {
        total_Money_Earned-=moneySpent;
    }
    // method to update the Money Spent By School
}
