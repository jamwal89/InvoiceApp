import java.util.Random;


public class DiceMonopoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//output("Roll your Dice");
		Random rnd = new Random();

		int counter = 0;

		while (counter < 3)
		{
			int z = 1 + rnd.nextInt(6);
			int y = 1 + rnd.nextInt(6);
			System.out.println("Die 1 is " + z);
			System.out.println("Die 2 is " + y);
			int x = (z+y);
			System.out.println("Total Steps are  " + x);
			
			if (z==y ){ 
				counter++;
				
				
			}
		if (counter==3){
			System.out.println("You have got 3 DOUBLES, GO TO JAIL");
			break;
			
		}
	}
	}
}
				
		
		


