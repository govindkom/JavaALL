package InterviewQuestions;

public class IncreasingNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N=5;
		int num =1;
	      
	      // Outer loop for the number of rows.
	      for(int i=1;i<=N;i++){
	          
	          // Inner loop will loop for i times and
	          // print numbers increasing by 1 each time.
	          for(int j=1;j<=i;j++){
	              System.out.print(num + " ");
	              num =num+1;
	          }
	          // As soon as the numbers for each iteration are printed, we move to the
	          // next row and give a line break otherwise all numbers
	          // would get printed in 1 line.
	          System.out.println();
	         
	      }
	}

	}


