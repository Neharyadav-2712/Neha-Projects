package company1;
import java.util.*;


class Game
{
public int number;
public int inputNumber;
public int nOfGuess;

public int getnoOfGuess()
{
	return getnoOfGuess();
}

public void setnoOfGuess(int nOfGuess)
{
	this.nOfGuess = nOfGuess;
}

Game()
{
	Random rand = new Random();
	this.number =rand.nextInt(100);
//	this.number=8;
}

public void takeuserinput()
{
	System.out.println("Guess the Number");
	Scanner Sc = new Scanner(System.in);
	this.inputNumber = Sc.nextInt();
}


boolean iscorrectNumber()
{
	//System.out.println(number);
	if(number == inputNumber)
	{
		nOfGuess++;
		System.out.printf("Yes you guess it Right, it was %d \n you guessed it is in %d attempts",number,nOfGuess);
		return true;
	}
	
	else if(inputNumber<number)
	{	
		nOfGuess++;
		System.out.println("Number is too small");
	}
	else if(inputNumber>number)
	{
		nOfGuess++;
		System.out.println("Number is too large");	
	}
	return false;
}
}


public class Cwh50_Exercise3_solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Create a class Game, which allows a user to play "Guess the Number'.Game should have the following method.

		// 1) Constructor to generate the random number.
		// 2) takeUserInput() to take a user input of number.
		// 3) isCorrectNumber() to detect whether the number entered by user is true
		// 4) getter and setter for noOfGuesses
		// 5) use properties such as noOfGuesses(int),etc to get this task done!.
		
		
		Game g = new Game();
		boolean b = false;
		while(!b)
		{
			g.takeuserinput();
			b=g.iscorrectNumber();
		}
		
		
		
		
		
		
		
		}
}
