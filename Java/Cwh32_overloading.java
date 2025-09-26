package company;

public class Cwh_32_overloading {
	
	public static void foo()
	{
		System.out.println("Good morning Neha");
	}
	
	static void foo(int a)
	{ 
		System.out.println("Good morning " + a + " Neha");
	}


	static void foo(int a, int b)
	{
		System.out.println("Good morning " + a + " Neha");
		System.out.println("Good morning " + b + " Neha");
	}
	
	static void change2(int [] arr)
	{
		arr[0] =77;
	}
	
	static void telljoke()
	{
		System.out.println(" I invented a new word sfsdfsddsa.");
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		//telljoke();
		
// case 1) changing the interger.
		
//		int [] marks = {65, 86, 65, 98, 86};
//		
//		int x = 45;
//		change(x);
//		
//		System.out.println("The value of x is after running change is " + x);
		
// case 2) changing the Array.
		
//int [] marks = {65, 86, 65, 98, 86};
//		
//		change2(marks);
//		
//		System.out.println("The value of x is after running change is " + marks[0]);
		

		
		// Method overloading
		
		foo();
		foo(86); 
		foo(424, 656);// arguments are actual.----------------means they are actual value.
	}

}

