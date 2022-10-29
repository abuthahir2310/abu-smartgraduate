package PartiallyClosedLabBook;

import java.util.Scanner;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first Integer:");
		num1=in.nextInt();
		System.out.println("Enter second Integer:");
		num2=in.nextInt();
		in.close();

		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("The first number is:"+num1);
		System.out.println("The second number is:"+num2);
	}
}
