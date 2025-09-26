package company;
import java.util.*;

//4) Modify a program in que 3 to throw a custom Exception if max retries are reached.

class MaxRetriveException extends Exception
{
	@Override
	public String toString()
	{
		return "I am a MaxRetriveException !!!!!!!!!!!!!!";
	}
}


public class Cwh86_Chapter14_Practice_set {
	
	// 5) Wrap the program in que 3 inside a method which throws your custom exception.
	
	public static void validArray(int i) throws MaxRetriveException
	{
		if(i>=5)
		{
			throw new MaxRetriveException();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// 1) write a java program  to demonstate syntac, logical and runtime Error	
		
		// 1) syntax error	
		
//		int a = 2 
//		int b = 3;
//		int c = a+b;
//		System.out.println(c);
		
		// 2) logical error
		
//		int age = 78;
//		int year_born = 2000-78;
//		System.out.println(year_born);
		
		// 3) runtime Error
		
//		System.out.println(6/0);
		
		
// 2) write a java program  to pritns "HaHa" during Arithmetic exception and "HeHe" during an Illegal argument exception.
		
 
//		int a = 20; 
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int b = sc.nextInt();
//		try
//		{
//			int c = a/b;
//			System.out.println(c);
//		}
//		catch(IllegalArgumentException e)
//		{
//			System.out.println("HeHe");
//		}
//		catch(Exception e)
//		{
//			System.out.println("HaHA");
//		}
		
//		try
//		{
//			int a = 20/0;
//		}
//		catch(IllegalArgumentException e)
//		{
//			System.out.println("HeHe");
//		}
//		catch(Exception e)
//		{
//			System.out.println("HaHA");
//		}
		
// 3) Write a program that allows you to keep accessing an array until a valid index is given. If max returns exceed 5 print "Error".		
		
	
		int[] marks1 = new int[3];
	
		marks1 [0] = 4;
		marks1 [1] = 8;
		marks1 [2] = 9;
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int i = 0;
		int index;
		while(flag && i<5)
		{
		System.out.println("Enter the value array index");
		
			try
			{
				index = sc.nextInt();
				System.out.println(marks1[index]);
				break;
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Invalid index");
				System.out.println(e);
				i++;
			}
	
		}
//		if(i>=5)
//		{
//			System.out.println("Error");
//		}
			
		// 4) Modify a program in que 3 to throw a custom Exception if max retries are reached.
		
//		if(i>=5)
//		{
//			try
//			{
//				throw new MaxRetriveException();
//			}
//
//			catch(Exception e)
//			{
//				System.out.println(e);
//			}
//		}
		
		// 5) Wrap the program in que 3 inside a method which throws your custom exception.
		
		try
		{
			validArray(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}
