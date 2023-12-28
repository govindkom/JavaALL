package InterviewQuestions;

public class ACharcterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha=65;
		 // Outer loop for the number of rows.
	      for(int i=0;i<5;i++){
	          
	          
	          for(int j=0;j<=i;j++){
	              
	              // same char which is defined 
	              // is to be printed i times in that row.
	              System.out.print((char)alpha+ " ");
	              
	          }
	          // As soon as the letters for each iteration are printed, we move to the
	          // next row and give a line break otherwise all letters
	          // would get printed in 1 line.
	          System.out.println();

	}

}
	
}
