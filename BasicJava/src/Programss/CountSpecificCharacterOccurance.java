package Programss;

public class CountSpecificCharacterOccurance {

	public static void main(String[] args) {
		// CountSpecificCharacterOccurance
		
		String str="java programming java oops";
		int totalcount=str.length();
		System.out.println(totalcount);

		int totalcountafterremoving=str.replaceAll("v", "").length();
		int count=totalcount-totalcountafterremoving;
		System.out.println("no of occurance of a is:"+count);
	}

}
