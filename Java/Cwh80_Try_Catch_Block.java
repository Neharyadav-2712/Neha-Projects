package company;

public class Cwh80_Try_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 6000;
		int b = 0;
		
		
		// Without 
//		 int c = a/b;
//		 System.out.println("The result is " + c);
		
		
	//	 With try
		try
		{
			int c = a/b;
			System.out.println("The result is " + c);
		}
		catch(Exception e)
		{
			System.out.println("We failed to divide Reason: ");
			System.out.println(e);
		}
		
	System.out.println("End of the Program");
		
	}

}
