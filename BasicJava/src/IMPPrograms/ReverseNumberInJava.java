package IMPPrograms;

public class ReverseNumberInJava {

	public static void main(String[] args) {
		// ReverseNumberInJava
		
		// Approach 01
		//int num=1432;
		/*int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is"+rev);
		
		// Approach 2====>using StringBuffer
		int num=12345;
	      StringBuffer sb= new StringBuffer(String.valueOf(num));
	      StringBuffer rev=sb.reverse();
	      System.out.print(rev);*/
		
		// Approach 3===> using StringBuilder
		int num=789;
		
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println(rev);

	}

}
