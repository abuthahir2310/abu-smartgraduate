package PartiallyClosedLabBook;

public class ComputerPI {

	public static void main(String[] args) {
	double sum=0.0;
	int MAX_Denominator=1000;
	for(int denominator=1;denominator<=MAX_Denominator;denominator+=2) {
		if(denominator%4==1) {
			sum+=(double)1/denominator;
		}
		else if(denominator%4==3) {
			sum-=(double)1/denominator;
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}
	System.out.println("The sum value we take from this formula is:"+sum);
	}

}
