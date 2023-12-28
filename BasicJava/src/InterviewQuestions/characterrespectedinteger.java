package InterviewQuestions;

public class characterrespectedinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      // Write your code here
		char inputChar = '9';  // Change this line to specify the input character

		        int output;

		        // Check if the character is uppercase
		        if (inputChar >= 'A' && inputChar <= 'Z') {
		            output = 1;
		        }
		        // Check if the character is lowercase
		        else if (inputChar >= 'a' && inputChar <= 'z') {
		            output = 0;
		        }
		        // Character is not an alphabet
		        else {
		            output = -1;
		        }

		        System.out.println("Output: " + output);
		    }
		

}
