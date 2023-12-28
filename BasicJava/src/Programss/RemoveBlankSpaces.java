package Programss;

public class RemoveBlankSpaces {

	public static void main(String[] args) {
		// RemoveBlankSpaces
		
		String str="java selenium project automation";
		System.out.println(str);
		
		str=str.replaceAll("\\s", "");
		System.out.println("after removing white blank spaces:"+str);

	}

}
