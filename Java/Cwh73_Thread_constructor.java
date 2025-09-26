package company;


class MyThr extends Thread
{
	public MyThr(String Name)
	{
		super(Name);
	}
	
	public void run()
	{
		int i=22;
		System.out.println("Thank You");
		
//		while(true)
//		{
//			System.out.println("I am a constructor");
//		}
		
		
	}
}

public class Cwh73_Thread_constructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThr t1 = new MyThr("Neha");
		MyThr t2 = new MyThr("Swati");
		t1.start();
		t2.start();
		System.out.println("The id of the Thread is:" + t1.getId());
		System.out.println("The id of the Thread is:" + t1.getName());
		System.out.println("The id of the Thread is:" + t2.getId());
		System.out.println("The id of the Thread is:" + t2.getName());
	}

}
