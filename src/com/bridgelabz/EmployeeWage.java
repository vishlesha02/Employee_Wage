package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;


public class EmployeeWage{
    public static final int IsFullTime = 1;
    public static final int IsPartTime = 2;

    int numOfCompany = 0;

   public ArrayList<CompanyEmpWage> companyEmpWageArrayList= new ArrayList<>();

   public void addCompany(String company,int empWagePerHour,int hoursPerMonth,int daysPerMonth)
   {
       CompanyEmpWage companyEmpWage= new CompanyEmpWage(company, empWagePerHour, hoursPerMonth, daysPerMonth);
       companyEmpWageArrayList.add(companyEmpWage);
       numOfCompany++;
   }
   
    public void  EmpWage()
    {
        for (int i=0;i< numOfCompany;i++)
        {

            CompanyEmpWage companyEmpWage=companyEmpWageArrayList.get(i);
            int totalEmpWage = EmpWage(companyEmpWage);
            System.out.println(companyEmpWageArrayList.get(i) + ", Total Employee Wage : " + totalEmpWage);
            System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        }
    }

    public int EmpWage(CompanyEmpWage CompanyEmpWage) {

        int empHours;
        int salary = 0;
        int totalSalary = 0;
        int totalEmpHour = 0;
        int day = 0;


        while (totalEmpHour < CompanyEmpWage.hoursPerMonth && day < CompanyEmpWage.daysPerMonth) {
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
            salary = empHours * CompanyEmpWage.empWagePerHour;
            totalSalary += salary;
            totalEmpHour += empHours;

            System.out.println("Day " + day + " - Employee Hrs : " + empHours + " - salary : " + salary );


        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Total Employee Wage for "  + CompanyEmpWage.company + " is : " + totalSalary);
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        return totalSalary;

    }
    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();
        obj.addCompany("Jio",30,80,22);
        obj.addCompany("Reliance",20,60,20);
        obj.EmpWage();
    }
}
