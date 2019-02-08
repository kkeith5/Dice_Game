import java.util.*;
public class Dice {
	static int Faceup;
	
	public Dice() {
		
	}
	
	protected static int rollDice(){
		Random random = new Random();
		Faceup = random.nextInt(6);
		return Faceup;
		
		
	}
	protected static void reportDice() {
		System.out.println("You rolled a "+Faceup);
		
	}

}
 