import java.util.Scanner;

public class FindAreaofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter side of square:");
		Scanner Scanner=new Scanner(System.in);
		double side=Scanner.nextDouble();
		double area=side*side;
		System.out.println("Area of square is:"+area);
	}

}
