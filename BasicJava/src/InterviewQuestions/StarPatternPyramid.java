package InterviewQuestions;

public class StarPatternPyramid {

	public static void main(String[] args) {
		/* StarPatternPyramid==========1)st patter
		*
		* *
		* * *
		* * * *
		* * * * *  
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd) patter
		 	* * * * *  
		 	* * * *
		 	* * *
		 	* *
		 	* 
		for(int i=0;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}  */
		
		//3rd Approach === combinig both and print
		
		/*   
		 * *
**
***
****
*****
****
***
**
*
		 */
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
	}
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
}
}
