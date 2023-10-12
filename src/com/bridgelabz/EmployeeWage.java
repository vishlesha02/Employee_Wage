package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        final int IsFullTime = 1;
        final int IsPartTime = 2;

        int empWagePerHour = 20;

        int fullDayHour = 8;
        int partTimeHour = 4;
        int DaysPerMonth = 20;

        int salaryPerMonth = 0;


        Random random = new Random();

        for(int day = 1; day <= DaysPerMonth; day++)
        {
            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IsFullTime:

                    salaryPerMonth += empWagePerHour * fullDayHour;
                    System.out.println("Day " + day + " " + ": Employee is Full Time Present. Employee Wage Per Day : " + (empWagePerHour*fullDayHour));

                    break;

                case IsPartTime:

                    salaryPerMonth += empWagePerHour * partTimeHour;
                    System.out.println("Day " + day + " " + ": Employee is Part Time Present. Employee Wage Per Day : " + (empWagePerHour*partTimeHour));

                    break;

                default:
                    System.out.println("Day " + day + " " + ": Employee is Absent. Employee Wage Per Day: 0");

            }
        }
        System.out.println("Monthly Salary : " + salaryPerMonth);
    }
}
