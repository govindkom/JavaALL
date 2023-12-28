package InterviewQuestions;

public class GCDOfTwoNumbers {
	
	public static void main(String[] args) {
		// GCDOfTwoNumbers
		int a=112;int b=545;
		System.out.println("GCD of"+a +" and"+b +"is"+findgcd(a,b));
	}
		public static int findgcd(int a, int b) {
		
		if(b==0) 
			return a;
			return findgcd(b, a%b);
	}

}
