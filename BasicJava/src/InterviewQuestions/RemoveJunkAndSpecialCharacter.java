package InterviewQuestions;

public class RemoveJunkAndSpecialCharacter {

	public static void main(String[] args) {
		// RemoveJunkAndSpecialCharacter
		
		String s= "!@#$%^&*()latin string 012346";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
