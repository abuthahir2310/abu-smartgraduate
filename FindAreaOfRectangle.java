import java.util.Scanner;

public class FindAreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scanner=new Scanner(System.in);
		System.out.println("Enter the lenght of Rectangle:");
		double lenght=Scanner.nextDouble();
		System.out.println("Enter the width of rectangle:");
		double width=Scanner.nextDouble();
		double area=lenght*width;
		System.out.println("Area of Rectangle is:"+area);
	}

}
