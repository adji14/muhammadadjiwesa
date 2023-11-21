import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	
		public static void main (String args[]) {
			Scanner keyboard = new Scanner (System.in);
			
			out.print ("Enter an int from 1 to 10: ");
			
			int inputnumber = keyboard.nextInt();
			int randomnumber = new Random ().nextInt(10) + 1;
			
			if (inputnumber == randomnumber) {
				out.println ("**********");
				out.println ("*You win.*");
				out.println ("**********");
			} else {
				out.println ("You lose.");
				out.print ("The random number was ");
				out.println (randomnumber + ".");
			}
			
			out.println ("Thanks you for playing.");
			
			keyboard.close ();
		}
}