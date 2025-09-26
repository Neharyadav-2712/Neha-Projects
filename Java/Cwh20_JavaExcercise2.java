package company;
import java.util.Random;
import java.util.*;

public class Cwh20_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Qyes 1) rock paper scissors game
		
		
		Random r= new Random();
		
		
		int cMove; 
		int userMove = 0; 
		int cScore = 0; 
		int pScore = 0; 
		int tie = 0;
		int rounds = 0; 
		
		
		cMove = r.nextInt(1 , 4);
		System.out.print("Number enter by computer is:");
		System.out.println(cMove);
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Number enter by user is  (between 1 to 3 , 1 for rock , 2 For paper , 3 scissors) ");
		userMove = sc.nextInt();
		

		}
	
	}



