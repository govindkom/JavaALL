package InterviewQuestions;

public class ArmstongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int number = 151; // Change this number to check for a different number

		        if (isArmstrongNumber(number)) {
		            System.out.println(number + " is an Armstrong number.");
		        } else {
		            System.out.println(number + " is not an Armstrong number.");
		        }
		    }

		    // Function to check if a number is an Armstrong number
		    public static boolean isArmstrongNumber(int num) {
		        int originalNumber = num;
		        int numDigits = String.valueOf(num).length();
		        int sum = 0;

		        while (num > 0) {
		            int digit = num % 10;
		            sum += Math.pow(digit, numDigits);
		            num /= 10;
		        }

		        return sum == originalNumber;
		    }
		


	}


