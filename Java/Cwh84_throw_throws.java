package company;

	class NagativeRadiusException  extends Exception
	{
		@Override
		public String toString()
		{
			return "Radius can not be negative";
		}
		
		@Override
		public String getMessage()
		{
			return "Radius can not be negative";
		}
	}
	public class Cwh84_throw_throws {
		
	public static double area (int r) throws NagativeRadiusException
	{
		if(r<0)
		{
			throw new  NagativeRadiusException();
		}
		double result = (float) (Math.PI*r*r);
		return result;
	}
	
	public static int divide(int a , int b) throws ArithmeticException 
	{
		// made by harry
		int result = a/b;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	 Shivam - uses divide function created by harry
		try
		{
			int c = divide(3,0);
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
			
		}
		
		try {
			double ar = area(5);
			System.out.println(ar);
		} 
		catch (NagativeRadiusException e) 
		{
			e.printStackTrace();
		}
	}

}
