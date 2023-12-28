package InterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		/* ReverseString=====1) stamdard way
		String str="govind";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
System.out.println(rev);*/
		
		
		//2nd way==== StringBuffer class
		String s="selenium";
		StringBuffer sf= new StringBuffer(s);
		System.out.println(sf.reverse());
		
		// 3rd way ====StringBuilder clas
		String s2="welcome";
		StringBuilder sb= new StringBuilder(s2);
		System.out.println(sb.reverse());
		
		// famous interview querstion on this toopic
		//1) reverse string
		//2) diff b/n string and stringbuffer
		//3) do we have reverse function in string class

	}

}
