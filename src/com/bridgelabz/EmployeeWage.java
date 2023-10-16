package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static final int IsFullTime = 1;
    public static final int IsPartTime = 2;
    public static String company;
    public static int empWagePerHour;
    public static int hoursPerMonth;
    public static int daysPerMonth;

    public EmployeeWage(String company,int empWagePerHour,int hoursPerMonth,int daysPerMonth)
    {
        this.company = company;
        this.empWagePerHour = empWagePerHour;
        this.hoursPerMonth = hoursPerMonth;
        this.daysPerMonth = daysPerMonth;

    }

    public static int EmpWage() {

        int empHours;
        int salary = 0;
        int totalSalary = 0;
        int totalEmpHour = 0;
        int day = 0;

        while (totalEmpHour < hoursPerMonth && day < daysPerMonth) {
            day++;
            Random random = new Random();

            int empCheck = random.nextInt(3);

            switch (empCheck) {
                case IsFullTime:
                    empHours = 8;
                    break;

                case IsPartTime:
                    empHours = 4;
                    break;

                default:
                    empHours = 0;

            }
            salary = empHours * empWagePerHour;
            totalSalary += salary;
            totalEmpHour += empHours;

            System.out.println("Day " + day + " - Employee Hrs : " + empHours + " - salary : " + salary );


        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Employee Wage for "  + company + " is : " + totalSalary);
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        return totalSalary;

    }
    public static void main(String[] args) {
        EmployeeWage obj1 = new EmployeeWage("Jio",20,60,18);
        obj1.EmpWage();
        EmployeeWage obj2 = new EmployeeWage("Reliance",30,80,22);
        obj2.EmpWage();

    }
}
