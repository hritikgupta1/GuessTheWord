import java.util.Scanner;

public class GuessTheWord {
	
	Scanner input = new Scanner(System.in);
	private boolean play = true;
	
	private String inp;
	private int rounds = 10;
	private char lastround;
	private words randomwords = new words();
	public void start() {
		
		do {
			showword();
			getinput();
			checkinput();
			
		}while(play);
	}
	
	void showword() {
		System.out.println("you have "+rounds+" tries left");
		System.out.println(randomwords);
	}
	void getinput() {
		System.out.print("Enter you letter here: ");
		inp = input.nextLine();
		lastround = inp.charAt(0);
		
	}
	void checkinput() {
		boolean guessright = randomwords.guess(lastround);
		
		if(guessright) {
			if(randomwords.isguessright()) {
				System.out.println("congrats! you won the game");
				System.out.println("the word is: "+randomwords);
				play = false;
			}
		
		}	
		else {
			--rounds;
			if(rounds == 0) {
				System.out.println("sorry! game over");
				play=false;
			}
		}
	}

	public void end() {
		input.close();
		
	}

}
