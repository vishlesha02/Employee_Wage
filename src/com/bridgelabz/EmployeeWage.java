package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {

        int iSFullTime = 1;

        Random random = new Random();
        int empCheck = random.nextInt(2);

        if (empCheck == iSFullTime)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }


    }
}
