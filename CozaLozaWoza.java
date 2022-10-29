package PartiallyClosedLabBook;

public class CozaLozaWoza {

	public static void main(String[] args) {
		int LOWERBOUND=1,UPPERBOUND=110;
		for(int number=LOWERBOUND;number<=UPPERBOUND;number++) {
			if( number%3==0) {
				System.out.println("coza");
			}
		    if(number%5==0) {
		    	System.out.println("loza");
		    }
		    if(number%7==0) {
		    	System.out.println("woza");
		    }
		    if(!(number%3==0||number%5==0||number%7==0)) {
		    	cozlozawoza+=number;
		    }
		    if(number%11==0) {
		    	cozlozawoza+="\n";
		    }
		    else {
		         cozlozawoza+=" ";
		    }
		    System.out.println(cozlozawoza);
		}
	}

}
