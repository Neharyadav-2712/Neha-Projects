package company;

import java.util.Scanner;

public class Cwh82_Nested_Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = new int[3];
		
		marks [0] = 4;
		marks [1] = 8;
		marks [2] = 9;
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
		while(flag)
		{
		System.out.println("Enter the value array index");
		int ide = sc.nextInt();
		try
		{
			System.out.println("Welcome to video no 82");
			
			try
			{
				System.out.println(marks[ide]);
				flag = false;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Sorry this index does not exist.");
				System.out.println("Exception in level 2");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception in level 1");
		}
		}
		System.out.println("Thanks for using this program");
	}

}


// Quick Quiz: - write a java program that allows you to keep accessing an array until a valid index is given by the user.


