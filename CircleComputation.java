package PartiallyClosedLabBook;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		double radius;
		System.out.println("Enter the radius:");
		Scanner in=new Scanner(System.in);
		radius=in.nextInt();
		double diameter=2.0*radius;
		double area=Math.PI*radius*radius;
		double circumference=2.0*Math.PI*radius;
		in.close();
		System.out.printf("The diameter of the circle is %f\n",diameter);
        System.out.printf("The area of the circle is %f\n",area);
        System.out.printf("The circumference of the circle is %f\n",circumference);
	}
}
