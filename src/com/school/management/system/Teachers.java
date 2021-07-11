package com.school.management.system;

public class Teachers {
    private int id; // Unique Id no. provided to Each Teacher
    private String name; // Name of Teacher
    private int salary; // Per Month Salary of Teacher
    private int leaves; // No. of leaves taken by Teacher
    private String subject; // Subject Taught by Teacher
    private int netSalary; // Net salary Earned By Teacher

    public Teachers(int id, String name, int salary, int leaves, String subject) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.leaves = leaves;
        this.subject = subject;
        this.netSalary =0;
    }

    public int getId() {
        return id;
    }
    // Return id of Teacher

    public String getName() {
        return name;
    }
    // Return Name of Teacher


    public int getSalary() {
        return salary;
    }
    // Return Monthly Salary of Teacher

    public int getLeaves() {
        System.out.println("Maximum Number of Leaves A Teacher can get is 25");
        return leaves;
    }
    // Return number of leaves taken by teacher

    public String getSubject() {
        return subject;
    }
    // Return Subject Taught by Teacher


    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }
    // Method To Update Number of Leaves Taken by Teacher

    public void setSalary(int salary){
        this.salary=salary;
    }
    // set the salary of Teacher


    public void receiveSalary(int salary){
        netSalary+=salary;
        School.updateMoneySpent(salary);
    }
    // Salary Received by Teacher
    // Salary is given from the Earning of the school


    @Override
    public String toString() {
        return "Name of the Teacher: " + name +" Total salary earned so far $" + netSalary + " Total Leaves Taken by Teacher: " + leaves;


    }
}
