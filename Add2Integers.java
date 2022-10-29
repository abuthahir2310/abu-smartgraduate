package PartiallyClosedLabBook;

import java.util.Scanner;

public class Add2Integers {

	public static void main(String[] args) {
		int number1,number2;
       try (Scanner scan=new Scanner(System.in)) {
    	   System.out.println("Enter  first integer:");
    	   int num1=scan.nextInt();
    	   System.out.println("Enter second integer:");
    	   int num2=scan.nextInt();
    	   int sum=num1+num2;
    	   System.out.println("The sum is "+sum);
          }
	}

}
