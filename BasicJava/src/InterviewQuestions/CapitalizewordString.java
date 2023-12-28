package InterviewQuestions;

public class CapitalizewordString {

	public static void main(String[] args) {
		// CapitalizewordString==== every character first need to be in capital
		
		String str="naveen automation lab";
		String word[]=str.split("\\s");
		String result="";
		
		for(String w:word) {
			String first=w.substring(0,1).toUpperCase();
			String reststr=w.substring(1);
		//	result=result+first+reststr;// will give resultwihtout space ==>NaveenAutomationLab 

			result=result+first+reststr+" "; // will give result with space==>Naveen Automation Lab 

		}
		System.out.println(result);
		

	}

}
