package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int iSFullTime = 1;
        int isPartTime = 2;
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int partTimeHour = 4;

        int salary;

        Random random = new Random();
        int empCheck = random.nextInt(3);

        if (empCheck == iSFullTime)
        {
            System.out.println("Employee is Full Time Present");
            salary = empWagePerHour*fullDayHour;
            System.out.println("Employee Wage = " + salary);
        }
        else if(empCheck == isPartTime)
        {
            System.out.println("Employee is Part Time Present");
            salary = empWagePerHour*partTimeHour;
            System.out.println("Employee Wage = " + salary);
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
