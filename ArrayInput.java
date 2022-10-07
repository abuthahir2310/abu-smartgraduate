import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		Scanner  Scanner=new Scanner(System.in);
		int[] Array=new int[10];
		int sum=0;
		System.out.println("Enetr a elements:");
		for(int i=0;i<10;i++) {
			Array[i]=Scanner.nextInt();
		}
        for(int num:Array) {
        	sum=sum+num;
        }
        System.out.println("sum of Array elemnts is:"+sum);
	}
}
