package PartiallyClosedLabBook;

import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		int min,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three numbers to find sum,product,min,max of those");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		scan.close();
		int sum=num1+num2+num3;
		int product=num1*num2*num3;
		min=num1;
		if(num2<min) {
			min=num2;
		}
		if(num3<min) {
			min=num3;
		}
		max=num1;
		if(num2<max) {
			max=num2;
		}
		if(num3<max) {
			max=num3;
		}
		System.out.println("The sum of three is:"+sum);
		System.out.println("The product of this three is:"+product);
		System.out.println("The minimum of this three is:"+min);
		System.out.println("the maximum of this three is:"+max);
	}
}
