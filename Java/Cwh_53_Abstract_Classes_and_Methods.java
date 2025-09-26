package company;


abstract class Parent2
{
	
public Parent2()
{
	System.out.println("Main base2 ka constructor hoon");
}


public void sayHello()
{
	System.out.println("Hello");
}

abstract public void greet();

abstract public void greet1();

}

class child extends Parent2
{

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Good Morning");
		
	}

	@Override
	public void greet1() {
		// TODO Auto-generated method stub
		System.out.println("Good Afternoon");
	}
	
	
	public void greet2() {
		// TODO Auto-generated method stub
		System.out.println("Good Afternoon");
	}
	
}

abstract class child1 extends Parent2
{

	public void th()
	{
		System.out.println("I am Good");
	}
}
public class Cwh_53_Abstract_Classes_and_Methods {

	public static void main(String[] args) {
		
		child c = new child();
	//	Parent2 p = new Parent2();   // object of abstract class is not called (through error)
	
	}
	
}
