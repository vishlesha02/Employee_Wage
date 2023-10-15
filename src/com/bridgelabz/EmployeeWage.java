package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static final int IsFullTime = 1;
    public static final int IsPartTime = 2;
    static int EMP_WAGE_PER_HOUR = 20;
    static int HOURS_PER_MONTH = 100;
    static int DAYS_PER_MONTH = 20;

    public void EmpWage() {

        int empHours = 0;
        int salaryPerMonth;
        int totalSalary = 0;
        int totalEmpHour = 0;
        int day = 0;

        while (totalEmpHour < HOURS_PER_MONTH && day < DAYS_PER_MONTH) {
            day++;
            Random random = new Random();

            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IsFullTime:

                    System.out.println("Employee is Full Time Present");
                    empHours = 8;
                    break;

                case IsPartTime:

                    System.out.println("Employee is Part Time Present");
                    empHours = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHours = 0;

            }
            salaryPerMonth = empHours * EMP_WAGE_PER_HOUR;
            System.out.println("Day " + day + " - salary : " + salaryPerMonth);
            totalSalary += salaryPerMonth;
            totalEmpHour += empHours;

        }
        System.out.println("Total Working Days : " + day);
        System.out.println("Total Employee Hrs : " + totalEmpHour);
        System.out.println("Total Salary : " + totalSalary);


    }
    public static void main(String[] args) {
        EmployeeWage obj=new EmployeeWage();
        obj.EmpWage();

    }

}
