package chapter;

import java.util.Random;
import java.util.Scanner;

public class Project
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess your first number.");
		int userInput=scan.nextInt();
		Random rand = new Random();
		int computerValue= rand.nextInt(100)+1;
		String keepPlaying = "y";
		
		while (keepPlaying.equals("y"))
		{
			if(userInput==computerValue)
			{
				System.out.println("Guess again");
				computerValue=rand.nextInt(100)+1;
				userInput=scan.nextInt();
			}
			while(userInput!=computerValue)
			{
				if(userInput>computerValue)
				{
					System.out.println("HI");
					System.out.println("Guess another number");
					userInput=scan.nextInt();
				}
				else if(userInput<computerValue)
				{
					System.out.println("LO");
					System.out.println("Guess another number");
					userInput=scan.nextInt();
				}
			}
			System.out.println("You win!");
			System.out.println("Would you like to keep playing, enter 'y' or 'n'");
			keepPlaying=scan.next();
		}

	}

}
