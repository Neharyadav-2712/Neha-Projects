package company;

class MyThr1 extends Thread
{
	public MyThr1(String Name)
	{
		super(Name);
	}
	
	public void run()
	{
	
while(true)
			System.out.println("Thank You" + this.getName() + " priority " + this.getPriority());
		
		
		
	}
}

public class Cwh74_Thread_priorities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ready Queue: T1 T2 T3 T4 T5
		
		MyThr1 t1 = new MyThr1("Kajal 1");
		MyThr1 t2 = new MyThr1("Kajal 2");
		MyThr1 t3 = new MyThr1("Kajal 3");
		MyThr1 t4 = new MyThr1("Kajal 4");
		MyThr1 t5 = new MyThr1("Kajal 5 (Most Imp)");
		
		t5.setPriority(10);
		t1.setPriority(5);
		t2.setPriority(4);
		t3.setPriority(3);
		t4.setPriority(Thread.MIN_PRIORITY);
		
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();		
		}		
}
	

