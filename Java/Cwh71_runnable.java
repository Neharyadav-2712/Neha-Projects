package company;

class MyThreadRunnable1 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<50)
		{
		System.out.println("I am a thread 1 not a threat");
        i++;
		}
	}
}


class MyThreadRunnable2 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<50)
		{
		System.out.println("I am a thread 2 not a threat");
		 i++;
		}
	}
}

public class Cwh71_runnable {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThreadRunnable1 buttet1 = new MyThreadRunnable1();
		Thread gun1 = new Thread(buttet1);
		MyThreadRunnable2 buttet2 = new MyThreadRunnable2();
		Thread gun2 = new Thread(buttet2);
		gun1.start();
		gun2.start();
	}
	}


