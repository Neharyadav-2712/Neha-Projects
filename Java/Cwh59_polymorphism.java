package company;

interface Mycamera1
{
	void takesnap();
	void recordVideo();
	private void greet()
	{
		System.out.println("Good Morning");
	}
	default void record4Kvideo()
	{  
		greet();
		System.out.println("Record Video in 4k");
	}
}

interface MyWifi1
{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MyCellPohone1
{  

	void callNumber(int phoneNumber)
	{
		System.out.println("Calling " + phoneNumber);
	}
	

	void callNumber()
	{
		System.out.println("Connecting");
	}
	
}

class MySmartPhone1 extends MyCellPohone1 implements MyWifi1 , Mycamera1
{
@Override
	public	void takesnap()
	{
		System.out.println("Taking Snap");
	}
@Override
public	void recordVideo()
{
	System.out.println("Taking video");
}

//public void record4kVideo()
//{
//	System.out.println("Taking Snap33");
//}
@Override
public String[] getNetworks()
{
	System.out.println("Getting list of Networks");
	String[] networklist = { "Harry","Neha","Kajal"};
	return networklist;
}
@Override
public void connectToNetwork(String network) 
{
	System.out.println("Connecting to " + network);
}

public void sampleMeth()
{
	System.out.println("Meth");
}

}

public class Cwh59_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mycamera1 cam = new MySmartPhone1();
		cam.takesnap();
		cam.recordVideo();
		cam.record4Kvideo();	
	
		MySmartPhone1 smart = new MySmartPhone1();
		smart.sampleMeth();
		smart.recordVideo();
		smart.callNumber(998877);
		smart.getNetworks();
		
		
	}

}
