package company;


class MyThread1 extends Thread
{
	
	@Override	
	public void run()
	{
		int i=0;
	while(i<200)
	{
	System.out.println("My thread1 is running");
	System.out.println("I am Happy");
	i++;
	}

}
}

class MyThread2 extends Thread
{
	
	@Override
	public void run()
	{
		int i=0;
		while(i<200)
	{
	System.out.println("My thread2 is good");
	System.out.println("I am Sad");
	i++;
	}

}
}

public class Cwh70_Creating_a_Thread_By_Extending_Thread_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1  t1 = new MyThread1();
		MyThread2  t2 = new MyThread2();
		t1.start();
		t2.start();
	}
	
	
}


