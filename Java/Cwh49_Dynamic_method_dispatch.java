package company;

class Phone
{
	public void greet()
	{
		System.out.println("Good Morning");
	}
	public void on()
	{
		System.out.println("Turning on Phone");
	}
}

class Smartphone extends Phone
{
	public void music()
	{
		System.out.println("playing music");
	}
	@Override
	public void on()
	{
		System.out.println("Turning on Smartphone");
	}
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Good night ");
		
	}
}

public class Cwh49_Dynamic_method_dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Phone obj = new Phone();
//		obj.name();	
//		Smartphone sobj = new Smartphone();
		
		Phone obj = new Smartphone();
		obj.greet();
		obj.on();
	}

}
