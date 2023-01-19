import java.util.Arrays;
import java.util.Random;

public class words {
	
	String[] randomwords = {"animals","happiness","sadness","diwali","holi","rakhi","festivals","month",
			"weeks","days","hours","seconds","minutes","name"};
	
	private String selectedword;
	
	private Random random = new Random(); //declaring random 
	
	private char[] letters;
	public words() {
		selectedword = randomwords[random.nextInt(randomwords.length)]; //for printing random words
		
		letters = new char[selectedword.length()]; //for storing array of size of selected word
		
	}

	public String toString() {
		
		StringBuilder word = new StringBuilder(); //this is our word
		
		// \u0000 means non-character
		
		for(char letter : letters) { 
			if(letter == '\u0000') {
				word.append('_');
			}
			else {
				word.append(letter);
			}
			word.append(' ');
		}
		return word.toString();// changes word to string
	}
	
	public boolean isguessright() {
		
		for(char letter:letters) {
			if(letter == '\u0000') {
				return false;
			}
		}
		return true;
	}

	public boolean guess(char letter) {
		
		boolean guessedright = false;
		for(int i=0;i<selectedword.length();i++) {
			
			if(letter == selectedword.charAt(i)) {
				letters[i]=letter;
				guessedright = true;
			}
		}
		return guessedright;
		
	}

	
	

}
