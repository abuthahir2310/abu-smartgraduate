package PartiallyClosedLabBook;

import java.util.Scanner;

public class IncomeTaxCalculatorWithDecision {

	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K=0.1;
		final double TAX_RATE_ABOVE_40K=0.2;
		final double TAX_RATE_ABOVE_60K=0.3;
		int taxable_income;
		int rate;
		double tax_payable;
		
		System.out.println("Enter the Taxable income:");
		Scanner in =new Scanner(System.in);
		taxable_income=in.nextInt();
		in.close();
		
		if(taxable_income>60000){
			rate=taxable_income-60000;
			tax_payable=20000*TAX_RATE_ABOVE_20K+20000*TAX_RATE_ABOVE_40K+rate*TAX_RATE_ABOVE_60K;
		}
		else if(taxable_income>40000) {
			rate=taxable_income-40000;
			tax_payable=20000*TAX_RATE_ABOVE_20K+20000*TAX_RATE_ABOVE_40K;
		}
		else if(taxable_income>20000){
			rate=taxable_income-20000;
			tax_payable=20000*TAX_RATE_ABOVE_20K;
		}
		else {
			tax_payable=0;
		}
		System.out.printf("The tax payable for this income is %f",tax_payable);
	}
}
