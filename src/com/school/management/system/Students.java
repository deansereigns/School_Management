package com.school.management.system;

public class Students {

    private int id; // Unique Id To Each Student
    private String name; // Name of the Student
    private int grade; // Grade of the Student
    private int leave; // No. of days student was on leave
    private int feesPaid; // Fee Paid By the Student. Initially it is 0
    private int feesTotal;// FEE FOR EVERY STUDENT IS $ 50,000

    public Students(int id, String name, int grade, int leave) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.leave = leave;
        this.feesPaid = 0;
        this.feesTotal = 50000;
    }


    public void setGrade(int grade){
        this.grade=grade;
    }
    // Method to Update Student Grade


    public void payFees(int fees){
        feesPaid+=fees;
        School.updateMoneyEarned(feesPaid);
    }
    // Method to Update The record of Fees Paid By Student


    public void setLeave(int leave) {
        this.leave = leave;
    }
    // Method to Update Number of leaves Taken by Student


    public int getId() {
        return id;
    }
    // Return Unique Id of the Student

    public String getName() {
        return name;
    }
    // Return Name of the Student

    public int getGrade() {
        return grade;
    }
    // Return Grade Obtained By the Student
    public int getLeave() {
        return leave;
    }
    // Return No. of Leaves Taken by Student

    public int getFeesPaid() {
        return feesPaid;
    }
    //Return Fees Paid by the student

    public int getFeesTotal() {
        return feesTotal;
    }
    // Return total fees of the student

    @Override
    public String toString() {
        return "Student's name :"+name+" Total fees paid so far $"+ feesPaid + " Total Leaves Taken by Student: " + leave;

    }
}
