package PartiallyClosedLabBook;

import java.util.Scanner;

public class PensionContributionCalculatorDecison {

	public static void main(String[] args) {
		final int SALARY_CEILING=6000;
		final double EMPLOYEE_RATE_55_AND_BELOW=0.2;
		final double EMPLOYEE_RATE_55_TO_60=0.13;
		final double EMPLOYEE_RATE_60_TO_65=0.075;
		final double EMPLOYEE_RATE_65_AND_ABOVE=0.5;
		final double EMPLOYEE_RATE_65_ABOVE=0.075;
		int salary,age;
		int contributable_salary;
		double employee_contribution=0,employer_contribution=0,total_contribution=0;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the salary:");
		salary=in.nextInt();
		System.out.println("enter the age:");
		age=in.nextInt();
		in.close();
		
		if(salary>SALARY_CEILING) {
			contributable_salary=6000;
		}
		else {
			contributable_salary=salary;
		}
		if(age>65) {
			employee_contribution=contributable_salary*EMPLOYEE_RATE_65_ABOVE;
			total_contribution=employee_contribution+employer_contribution;
		}
		else if(age>=60) {
			employee_contribution=contributable_salary*EMPLOYEE_RATE_60_TO_65;
			total_contribution=employee_contribution+employer_contribution;
		}
		else if(age>=55) {
			employee_contribution=contributable_salary*EMPLOYEE_RATE_55_TO_60;
			total_contribution=employee_contribution+employer_contribution;
		}
		else {
			employee_contribution=contributable_salary*EMPLOYEE_RATE_55_AND_BELOW;
			total_contribution=employee_contribution+employer_contribution;
		}
		System.out.printf("Employee's contribution is %f\n",employee_contribution);
		System.out.printf("Employer's contribution is %f\n",employer_contribution);
		System.out.printf("The total contribution is %f",total_contribution);
	}
}
