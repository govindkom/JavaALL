package IMPPrograms;

public class SwitchVowelExample {

	public static void main(String[] args) {
		// SwitchVowelExample
		
		// Program to check Vowel or Consonant:
		// If the character is A, E, I, O, or U, it is vowel otherwise consonant. It is not case-sensitive.
		
		char ch='O';
		switch(ch) {
	
		case 'a':
			System.out.println("a is vowel");
			break;
			
		case 'e':
			System.out.println("b--vowel");
			break;
			
		case 'i':
			System.out.println("i--vowel");
			break;
			
		case'O':
			System.out.println("o=vowel");
			break;
			
		case 'u':
			System.out.println("u-vowel");
			break;
			
		default:
			System.out.println("all are consonant");
		break;
		
	
		
		}
	}

}
