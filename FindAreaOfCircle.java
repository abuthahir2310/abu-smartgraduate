import java.util.Scanner;

public class FindAreaOfCircle {

	public static void main(String[] args) {
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enetr the Radius:");
		double radius=Scanner.nextDouble();
		double area=3.14*(radius*radius);
		double circumference=3.14*2*radius;
		System.out.println("The circumferenec of the circle is:"+circumference);
	}

}
