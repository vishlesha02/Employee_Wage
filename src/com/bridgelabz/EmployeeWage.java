package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int iSFullTime = 1;
        int empWagePerHour = 20;
        int fullDayHour = 8;
        int salary;


        Random random = new Random();
        int empCheck = random.nextInt(2);

        if (empCheck == iSFullTime)
        {
            System.out.println("Employee is Present");
            salary = empWagePerHour*fullDayHour;
            System.out.println(salary);
        }
        else
        {
            System.out.println("Employee is Absent");
        }


    }
}
