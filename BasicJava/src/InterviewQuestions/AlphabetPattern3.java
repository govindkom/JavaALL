package InterviewQuestions;

public class AlphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* AlphabetPattern2
		A
		A A
		A A A 
		A A A A
		A A A A A
		
		ASCII VALUE OF A-Z=65to 90
		ASCII VALUE OF a-z=97to 122
		
		*/
		int alpha=65;
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)alpha+" ");
			}
		
			System.out.println();
		}

	}




	}


