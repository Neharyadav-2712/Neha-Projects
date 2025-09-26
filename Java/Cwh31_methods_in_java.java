package company;

public class Cwh_31_methods_in_java {
	
	static int logic(int x, int y)
	{
		int z;
		if(x>y)
		{
			z=x+y;
		}
		else
		{
			z =(x+y)*2;
		}
		
		return z;
		
	}
	
//	 int logic(int x, int y)
//	{
//		int z;
//		if(x>y)
//		{
//			z=x+y;
//		}
//		else
//		{
//			z =(x+y)*2;
//		}
//		
//		return z;
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 3;
		int c;
	
		c=logic(a,b);
		// Method invocation using object creation.
		//Cwh_31_methods_in_java obj = new Cwh_31_methods_in_java();
		//c = obj.logic(a, b);
		System.out.println(c);
		
		int a1 = 5;
		int b1 = 8;
		int c1;
		// Method invocation using object creation.
		//Cwh_31_methods_in_java obj1 = new Cwh_31_methods_in_java();
		//c1 = obj.logic(a1, b1);
		 c1=logic(a1,b1);
		 System.out.println(c1);
		 
	}

}
