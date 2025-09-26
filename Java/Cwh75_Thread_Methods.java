package company;

class MyThr2 extends Thread
{
	@Override
	public void run()
  {
		while(true)
	{
		System.out.println("Thank You");
		try 
		{
			Thread.sleep(455);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
  }
}

class MyThr3 extends Thread
{
	@Override
	public void run()
	{
		while(true)
		{
			System.out.println("Thank You so much");	
		}		
	}
}

public class Cwh75_Thread_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThr2 t2 = new MyThr2();
		MyThr3 t3 = new MyThr3();
		
		t2.start();
//		try
//		{
//			t2.join();
//		}
//		
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
	
		t3.start();
		
		}		
}
	

