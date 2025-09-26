package company;
import java.util.*;
import java.util.Scanner;

public class Cwh_41_Java_Exercise_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Rock 
		// Paper
		// Scissor
		
		System.out.println("Enter 0 for Rock, 1 for paper and 2 for Scissor");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		Random random = new Random();
		int computerInput = random.nextInt(3);
		
		if(userInput == computerInput)
		{
			System.out.println("Draw");
		}
		else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
		{
			System.out.println("Congratulations You Win!");
		}
		else 
		{
		System.out.println("Computer Win!");
		}
		
		System.out.println("Computer Choice:" + computerInput);
		
		if(computerInput == 0)
		{
			System.out.println("Computer Choice: Rock");
		}
		else if(computerInput == 1)
		{
			System.out.println("Computer Choice: paper");l
		}
		else
		{
			System.out.println("Computer Choice: Scissor:");
		}
	}

}
