package IMPPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str="automation";
		char chars[]=str.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
		

	}

}
