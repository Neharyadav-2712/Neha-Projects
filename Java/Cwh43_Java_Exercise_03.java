package company;
import java.util.*;


// Create a class Game, which allows a user to play "Guess the Number'.Game should have the following method.

// 1) Constructor to generate the random number.
// 2) takeUserInput() to take a user input of number.
// 3) isCorrectNumber() to detect whether the number entered by user is true
// 4) getter and setter for noOfGuesses
// 5) use properties such as noOfGuesses(int),etc to get this task done!.

class Game
{
public int number;
public int inputNumber;
public int noOfGuesses= 0;	

public int getNoOfGuesses()
{
	return noOfGuesses;
}

public void setNoOfGuesses(int noOfGuesses )
{
	this.noOfGuesses = noOfGuesses;
}

 Game()
{
Random rand = new Random();
this.number=rand.nextInt(100);
this.number=8;

}

void takeUserInput()
{
	System.out.println("Guess the Number");
	Scanner Sc = new Scanner(System.in);
	this.inputNumber = Sc.nextInt();
}

boolean isCorrectNumber()
{
	if(inputNumber == number)
	{
		noOfGuesses++;
		System.out.format("Yes you guessed it right, it was  %d\n you guessed it is in %d attempts",number,noOfGuesses);
		return true;
	}
	else if(inputNumber<number)
	{
		noOfGuesses++;
		System.out.println("Too less....");
	}
	else if(inputNumber>number)
	{
		noOfGuesses++;
		System.out.println("Too high....");
	}
	return false;
}

}
public class Cwh43_Java_Exercise_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g = new Game();
		boolean b=false;
		
		while(!b) 
		{
	    g.takeUserInput();
	    b=g.isCorrectNumber();
		}
		
	}

}
