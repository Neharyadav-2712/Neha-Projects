package company;

import java.util.Scanner;

class MyException extends Exception
{
	@Override
	public String toString()
	{
		// return super.toString()+ "I am a String";
		return "I am a String";
	}
	
	@Override
	public String getMessage()
	{
		//return super.getMessage() + "I am a getMessage";
		return "I am a getMessage";
	}
}


//class MaxAgeException extends Exception
//{
//	@Override
//	public String toString()
//	{
//		// return super.toString()+ "I am a String";
//		return "Age cannot be greater than 25";
//	}
//	
//	@Override
//	public String getMessage()
//	{
//		//return super.getMessage() + "I am a getMessage";
//		return "Make sure that the value of age entered is correct";
//	}
//}

public class Cwh83_exception_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		a = sc.nextInt();
		if(a<8)
		{
			try
			{
				//throw new MyException();
				throw new ArithmeticException("I am an Exception");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
				System.out.println(e.toString());
			//	System.out.println(e);
				e.printStackTrace();
				System.out.println("Finished");
			}
			System.out.println("Yes Finished");
		}

	}

}
