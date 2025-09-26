package company;

import java.util.Scanner;

public class Cwh81_Handling_Specific_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] marks = new int[3];
		
		marks [0] = 4;
		marks [1] = 8;
		marks [2] = 9;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array index");
		int ide = sc.nextInt();
		
		
		System.out.println("Enter the Number you want to divide the value with");
		int number = sc.nextInt();
		
		try
		{
			System.out.println("The value at array index entered is: " + marks[ide]);
			System.out.println("The value of array-value/number is: " + marks[ide]/number);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException occured");
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occured");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Some other exception occured");
			System.out.println(e);
		}
	}

}
;
