package InterviewQuestions;

public class starpattern2 {

	public static void main(String[] args) {
		/* starpattern2
		 
		 		* 
		 	 *	* 
			* * *
		* * * * 
		*/
		
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
