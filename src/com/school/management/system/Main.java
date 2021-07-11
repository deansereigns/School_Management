package com.school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int id, leaves, grade ,amount;
        String name , subject;
        Scanner scan = new Scanner(System.in);
        System.out.println("BCS welcomes you");
        System.out.println();
        Teachers A;
        Students B;
        List<Teachers> teacherList = new ArrayList<>();
        List<Students> studentList = new ArrayList<>();
        School bcs = new School(teacherList,studentList);
        int a = ((int) Math.random())*8;
        while(a!=8) {
            System.out.println("Enter the Code Depending on the type of information you want to update:");
            System.out.println("1. Enter the records of a new Teacher.");
            System.out.println("2. Enter the records of a new Student.");
            System.out.println("3. To perform the operation on Teacher.");
            System.out.println("4. To perform the operation on Student.");
            System.out.println("5. To check records of Teacher.");
            System.out.println("6. To check record of Student.");
            System.out.println("7. To check the records of School.");
            System.out.println("8. TO Exit.");
            a = scan.nextInt();
            switch(a){
                case 1:
                    System.out.println("Enter the Teacher ID, Name, Salary, No. of leaves taken and subject taught by teacher respectively.");
                    id = scan.nextInt();
                    scan.nextLine();
                    name = scan.nextLine();
                    amount = scan.nextInt();
                    scan.nextLine();
                    leaves = scan.nextInt();
                    scan.nextLine();
                    subject = scan.nextLine();
                    A = new Teachers(id,name,amount,leaves,subject);
                    teacherList.add(A);
                    System.out.println("Teacher Added Successfully.");
                    break;

                case 2:
                    System.out.println("Enter the Student ID, Name, Grade and  No. of leaves taken by student respectively.");
                    id = scan.nextInt();
                    scan.nextLine();
                    name = scan.nextLine();
                    grade = scan.nextInt();
                    scan.nextLine();
                    leaves = scan.nextInt();
                    scan.nextLine();

                    B = new Students(id,name,grade,leaves);
                    studentList.add(B);
                    System.out.println("Student Added Successfully.");
                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;

                case 8:
                    System.out.println("Thanks and Have a Good Day.");
                    scan.close();
                    break;


                default:
                    System.out.println("Please Enter a Valid Code.");
                    break;
            }

        }

    }
}
