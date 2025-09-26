package company;

import java.util.Scanner;

public class Cwh78_and_79_Error_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
// 1) Syntax Error		
		
//	int a = 5  error :- no semicolon present
//      b = 4; error :- b not declare
		
// 2) Logical Error Demo

// Write a Program between 1 to 10;
	
//	System.out.println(2);	
//	
//	for (int i=1 ; i<5; i++)
//	{
//		System.out.println(2*i+1);
//	}
//		
	
// 3) Runtime Error
	
	int k;
	System.out.println("Enter the Number below0");
	Scanner sc = new Scanner(System.in);	
	k = sc.nextInt();
	System.out.println(" Interger part of 1000 divided by k is " + 1000/k);
	
	
	}

}
