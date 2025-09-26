package company;

//1) write a program to print "good morning" and "welcome" continuously on the screen in java using Threads.
class MyThr4 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("Good morning");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void setPriority6() {
		// TODO Auto-generated method stub
		
	}
}


class MyThr5 extends Thread
{
	public void run()
	{
//		while(true)
//		{
//			System.out.println("Welcomefhggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggf");
//// 2) Add sleep method in welcome thread to delay the execution for 200ms.
//			
//			try {
//				Thread.sleep(2);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
}
}

public class Cwh76_Chapter_13_Practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1) write a program to print "good morning" and "welcome" continuously on the screen in java using Threads.		
			
		MyThr4 t4 = new MyThr4();
		MyThr5 t5 = new MyThr5();
		
// 3) Demonstrate getPriority() and setPriority methods.
		
		t4.setPriority(6);
		t5.setPriority(9);
		System.out.println(t4.getPriority());
		System.out.println(t5.getPriority());
		
// 4) How to get state of given thread		
		
		System.out.println(t5.getState());
		
	//	t4.start();
		t5.start();
		System.out.println(t5.getState());
	 
// 5) How to get reference to current thread in java.	
		
		System.out.println(Thread.currentThread().getState());
	}

}

