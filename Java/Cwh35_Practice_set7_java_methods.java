package company;

import java.nio.file.spi.FileSystemProvider;

public class Cwh35_Practice_set7_java_methods {

	
//	1) write a java method multiplication table of a number n.
	
//	static void multiplication(int n)
//	{
//		for(int i=1; i<=10; i++)
//		//	System.out.format("%d * %d = %d\n", n,i,n*i);
//	
//	}
	
//	2) Print a following * patten.
	
//	static void patten1(int n)
//	{
//		for(int i=0 ; i<n; i++)    // rows
//		{
//			for(int j=0 ; j<i+1; j++) {// how many times we want
//				System.out.print("*");
//		}
//		System.out.println("\n");
//		}
//	}
	

//	3) 	Write a recursive function to calculate sum of n natural no.
	
// sum(n) = 1+2+3..........+n;	
	// sum(n) = 1+2+3..........n-1 +n;
	// sum(n) = 1+2+3..........+n;	
	// sum(n) = sum(n-1) +n;
	// sum(3) = 3+ sum(2);
	// sum(3) = 3+ 1+sum(1);
	
 	
//static int sumReact(int n){
//	
//	if(n==1)
//	{
//		return 1;
//	}
//	else 
//	{
//	
//		return n + sumReact(n-1);	
//	}
//	
//}
	
	// Normal
	
//	static void number(int n)
//	{
//		int sum=0;
//		for(int i=1; i<=n; i++)
//		{
//			sum+=i;
//			
//		}
//		System.out.println("The Sum of n natural number is " + sum);
//	}


//4) 	Write a function to  Print a following * patten.
	
//	static void patten2(int n)
//	{
//		for(int i=5; i>0; i--) 
//		{
//			for(int j=0; j<i; j++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println("\n");
//			
//		}
//		
//
//	}
	
	
	
	//5)	Write a fibonacci series using recursion.
	
	// fibonacci series = 0.1.1.2.3.5.8.12.21.34
	
//	static int fib(int n)
//	{
//      if(n==1)	
//      {
//    	  return 0;
//      }
//      else if(n == 2)
//      {
//    	  return 1;
//      }
		
//		or
		
//		 if(n==1 || n==2)
//		 {
//			 return n-1;
//		 }
//		
//      else
//      {
//    	  return fib(n-1) + fib(n-2);        
//      }
//      
//	}
//	
	
	
	//6) 	Write a function to find average of a set of numbers passed arrgugment.
	
	
//	static void avg(int n)
//	{
//		int sum = 0;
//		for(int i=0; i<n; i++)
//		{
//			sum+=i/5;
//		}
//		System.out.println("The Average of number is " + sum*100);
//	}

	//7) 	Repeat 4 using recursion.
	
	static void patten2_rec(int n)
	{
		if(n>0)
		{
			patten2_rec(n-1);
			for(int i=5; i<0; i++) 	
			{
				System.out.print("*");
			}	
			
			System.out.println("\n");
		}
		
		
		
	}	
	
	//8) 	Repeat 2 using recursion.	
	
//	static void patten1_rec(int n)
//	{
//		if(n>0)
//		{
//			patten1_rec(n-1);
//			for(int i=0; i<n; i++)
//			{
//				System.out.print("*");
//			}	
//			
//			System.out.println("\n");
//		}
//		
//		
//		
//	}
	
	
	//9) 	write a function to convert celsiud temp into fahrenheit
	
	
	//10) 	Repeat 3 using iterative approach.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	1) write a java method multiplication table of a number n.

	//	multiplication(5);
		
//	2) Print a following patten.
		
		
//		patten1(10);

//	3) 	Write a recursive function to calculate sum of n natural no.
		
		// Normal
			
	//	number(15);
	
//	int x =15;
//		
//	System.out.println("The Sum of n natural number is : " + sunReact(x));
	
	
//4) 	Write a function to  Print a following * patten.
		
//		patten2(5);
		
		
//5) 	Write a fibonacci series using recursion.
		
//		int x = 7;
//		int result = fib(x);
//		
//		System.out.println(result);
		
//6) 	Write a function to find average of a set of numbers passed arrgugment.
		
		
//		avg(5);
		
//7) 	Repeat 4 using recursion.
		
		patten2_rec(5);
		
//8) 	Repeat 2 using recursion.
	
//	patten1_rec(5);

//9) 	write a function to convert celsiud temp into fahrenheit
		
		
//10) 	Repeat 3 using iterative approach.
		
	}
}
