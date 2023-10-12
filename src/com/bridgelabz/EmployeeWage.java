package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        final int IsFullTime = 1;
        final int IsPartTime = 2;

        int empWagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int salary;

        Random random = new Random();
        int empCheck = random.nextInt(3);

        switch (empCheck) {
            case IsFullTime:
                System.out.println("Employee is Full Time Present");
                salary = empWagePerHour * fullDayHour;
                System.out.println("Employee Wage = " + salary);
                break;

            case IsPartTime:
                System.out.println("Employee is Part Time Present");
                salary = empWagePerHour * partTimeHour;
                System.out.println("Employee Wage = " + salary);
                break;

            default:
                System.out.println("Employee is Absent");
        }
    }
}
