import java.util.Scanner;
public class Controller extends Dice  {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int roll  = dice1.rollDice();
		System.out.println("roll is number "+roll);
		
		int roll2 = dice1.rollDice();
		System.out.println("roll2 is number "+roll2);
		
		dice1.reportDice();
		
		Scanner sc = new Scanner(System.in);
		
		do {
			roll  = dice1.rollDice();
			System.out.println("roll is number "+roll);
			
			roll2 = dice1.rollDice();
			System.out.println("roll2 is number "+roll2);
			
			dice1.reportDice();
			
			if(roll == roll2) {
				System.out.println("You are a winner");
			}
			System.out.println("Do you want to play again? ");
			String decision = sc.nextLine();
			
		}
		while (roll != roll2);{
			
			
		}
		
		
	}

}
