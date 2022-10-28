package PartiallyClosedLabBook;

public class HarmonicSum {

	public static void main(String[] args) {
		int MAX_Denominator=50000;
		double L2Rsum=0.0;
		double R2Lsum=0.0;
		double abs_difference=0.0;
		
		for(int denominator=1;denominator<=MAX_Denominator;denominator++){
			L2Rsum+=(double)1/denominator;
		}
		for(int denomintor=MAX_Denominator;denominator>=1;denominator--){
			R2Lsum+=(double)1/denominator;
		}
		abs_difference=L2Rsum-R2Lsum;
		
		if(L2Rsum>R2Lsum) {
			System.out.println("left to Right sum of harmonic series is greater than Right to Left \nthe difference is"+Math.abs(abs_difference));
			System.out.println("sum of L2R"+L2Rsum);
			System.out.println("sum of R2L"+R2Lsum);
		}
		else if(R2Lsum>L2Rsum) {
			System.out.println("Right to Left sum of harmonic series is greater than Left to Right \nthe difference is"+Math.abs(abs_difference));
			System.out.println("sum of L2R"+L2Rsum);
			System.out.println("sum of R2L"+R2Lsum);
		}
		else {
			System.out.println("Both are same");
			System.out.println("sum of L2R"+L2Rsum);
			System.out.println("sum of R2L"+R2Lsum);
		}
	}
}
