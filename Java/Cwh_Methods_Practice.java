package company;

public class Cwh_Methods_Practice {

	
//	static void telljoke() 
//	{
//		System.out.println("plagiarism");
//	}
//	
//	
//	static void change(int a) 
//	{
//		 a = 83;
//	}
//	
//	static void change2(int [] arr) 
//	{
//		arr[0]=98;
//	}
//	
//	static int logic(int x, int y)
//	{
//		int z;
//		
//		if(x>y)
//		{
//			z = x+y;
//		}
//		else
//		{
//			z = (x+y)*5;
//		}
//		
//		return z;
//	}
//	
//	
//	static void foo()
//	{
//		System.out.println("Good morning");
//	}
//	
//	static void foo(int x)
//	{ 
//		System.out.println("Good morning " + x +" sdfsdfs");
//	}
//	static void foo(int x,int y)
//	{ 
//		System.out.println("Good morning " + x +" sdfsdfs");
//		System.out.println("Good morning " + y +" sdfsdfs");
//	}
	
//	static int sum(int a, int b)
//	{
//		return a + b;
//	}
//	static int sum(int a, int b,int c)
//	{
//		return a + b + c;
//	}
//	static int sum(int a, int b,int c,int d)
//	{
//		return a + b + c + d;
//	}

	
//	static int sum(int...arr)
//	{
//		int result=0;
//		for(int a :arr)
//		{
//			result+=a;
//		}
//		return result;
//	}
	
	
//	static int factorial(int n)
//	{
//		if(n==0 || n==1)
//		{
//			return 1;
//		}
//		else
//		{
//			return n*factorial(n-1);
//		}
//	}
//	
//	static int factorial_iterative(int n)
//	{
//		if(n==0 || n==1)
//		{
//			return 1;
//		}
//		else
//		{
//			int product = 1;
//			for(int i=1; i<=n;i++)
//			{
//				product*=i;
//			}
//			return product;
//		}
//	}
	
// Multiplication of table   lect no. 35

//	static void multiplication(int n)
//	{
//		for(int i=1; i<=10;i++)
//		{
//			System.out.printf("%d*%d = %d\n" , n,i,n*i);
//		}
//	}

	
	// Write a program to print foll. pattern
	
//	static void pattern(int n)
//	{
//		for(int i=0 ; i<n; i++)
//		{
//			for(int j=0; j<i+1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
	
	
//	static void pattern_rec2(int n)
//	{
//	if(n>0)
//	{
//		pattern_rec2(n-1);
//		
//		for(int i=0 ; i<n; i++)
//		{
//			for(int j=0; j<i+1;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//	}
//	}
	
//	static int sum(int n)
//	{
//		if(n==1)
//		{
//			return 1;
//		}
//		else 
//		{
//			return n+ sum(n-1);
//		}
//	}
	
	
	// Write a program to print foll. pattern
	
//	static void pattern1(int n)
//	{
//		for(int i=n ; i>0; i--)
//		{
//			for(int j=0; j<i ;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//	}
//	
	
//	static int fib(int n)
//	{
//		if(n==1 || n==2)
//		{
//			return n-1;
//		}
//		else
//		{
//			return fib(n-1) + fib(n-2);
//		}
//	}
////	
//	static void patten2_rec(int n)
//	{
//		if(n>0)
//		{
//			patten2_rec(n-1);
//			for(int i=0; i<n; i++) 	
//			{
//				System.out.print("*");
//			}	
//			
//			System.out.println("\n");
//		}
//			
//		
//	}
	
	
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//// Method invocation using object creation 
//// CWH_Methods_Practice obj = new 	CWH_Methods_Practice();
//// c = obj.logic(a,b);
//// c1 = obj.logic(a1,b1);
//	int a = 5;
//	int b = 7;
//	int c;
//	
//	c = logic(a,b);
//	System.out.println(c);
//	
//	
//	
//	int a1 = 2;
//	int b1 = 1;
//	int c1;
//	
//	c1 = logic(a1,b1);
//	System.out.println(c1);
//	
//	telljoke();
//	
//	int x=44;
//	change(x);
//	System.out.println(x);
//	
//	
//	int [] marks = {3,5,7,52,88};
//	change2(marks);
//	System.out.println(marks[0]);
//	
//	foo();
//	foo(3);
//	foo(4,6);
		
//	System.out.println("Welcome to the varargs tutorial");
//	System.out.println("sum of nothing " + sum());
//	System.out.println("The sum of 4 and 5 is: " + sum(4,5));
//	System.out.println("The sum of 6 and 5 is: " + sum(6,5));
//	System.out.println("The sum of 8 and 3 is: " + sum(8,3));
//	System.out.println("The sum of 9 and 4 is: " + sum(9,4));
	
//		int x =5;
//	System.out.println(factorial(x));
//		
//		System.out.println(factorial_iterative(x));
		
		
		// Multiplication of table   lect no. 35
		
	//	multiplication(5);
		
	//	pattern(5);
		
	//	pattern1(5);
		
	//	System.out.println(sum(6));
		
	//	int result = fib(7);
	//	System.out.println(result);
		
//		patten2_rec(5);
//		pattern_rec2(5);
		
	
	}

}
