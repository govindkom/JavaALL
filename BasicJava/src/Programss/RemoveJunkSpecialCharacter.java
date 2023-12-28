package Programss;

public class RemoveJunkSpecialCharacter {

	public static void main(String[] args) {
		// RemoveJunkSpecialCharacter
		
		String s="@#?*!=-$latinstring01234";
		System.out.println(s);
		s=s.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(s);
		
		String s1="@#$%&Automation&% testing";
		s1=s1.replaceAll("[^ a-z A-z 0-9]", " ");
		System.out.println(s1);
	}

}
