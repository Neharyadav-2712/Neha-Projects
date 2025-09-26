package company;

interface Mycamera
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

interface MyWifi
{
	String[] getNetworks();
	void connectToNetwork(String network);
}
class MyCellPohone
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

class MySmartPhone extends MyCellPohone implements MyWifi , Mycamera
{
@Override
	public	void takesnap()
	{
		System.out.println("Taking Snap");
	}
@Override
public	void recordVideo()
{
	System.out.println("Taking Snap");
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


}

public class Cwh_57_Default_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MySmartPhone ms = new MySmartPhone();
		ms.record4Kvideo();
	//	ms.greet(); // through an error
		String[] ar = ms.getNetworks();
		for(String atem: ar)
		{
			System.out.println(atem);
		}
	}

}
