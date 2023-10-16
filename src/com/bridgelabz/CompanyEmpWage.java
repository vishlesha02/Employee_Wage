package com.bridgelabz;

public class CompanyEmpWage {
    public String company;
    public int empWagePerHour;
    public int hoursPerMonth;
    public int daysPerMonth;

    public CompanyEmpWage(String company,int empWagePerHour,int hoursPerMonth,int daysPerMonth)
    {
        this.company = company;
        this.empWagePerHour = empWagePerHour;
        this.hoursPerMonth = hoursPerMonth;
        this.daysPerMonth = daysPerMonth;

    }

    @Override
    public String toString() {
        return "Company Employee Wage --> " +
                "company = '" + company + '\'' +
                ", empWagePerHour = " + empWagePerHour +
                ", hoursPerMonth = " + hoursPerMonth +
                ", daysPerMonth = " + daysPerMonth;
    }
}
