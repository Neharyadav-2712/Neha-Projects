package company;

public class Cwh33_varargs {

	
//	static int sum(int a, int b)
//	{
//		return a + b;
//	}
//	
//	static int sum(int a, int b,int c)
//	{
//		return a + b + c;
//	}
//	
//	static int sum(int a, int b,int c,int d)
//	{
//		return a + b + c + d;
//	}
	
	
	static int sum(int x, int ...arr) {
	int result = x;
	{
		for(int a: arr)
		{
			result+=a;
		}
	}
	return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Welcome to the Tuotorial");
		//System.out.println("The sum of nothing is: " + sum());
		System.out.println("The sum of nothing is: " + sum(1));
		System.out.println("The sum of 23 and 55 is: " + sum(23,55));
		System.out.println("The sum of 23,35 and 55 is: " + sum(23,35,76));
		System.out.println("The sum of 23,88,35 and 55 is: " + sum(23,88,35,55));
	}

}
