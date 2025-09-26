package company1;

class Base1
{
	public Base1()
	{
		System.out.println("I am a base class constructor.");
	}
	
	public Base1(int i)
	{
		System.out.println("I am a base class constructor with a value of a is:
	}
	
	int x;
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x=x;
	}
}

class Derived1 extends Base
{
	int y;

public int getY()
{
	return y;
}
public void setY(int y)
{
	this.y=y;
}
	
}
public class Cwh46_Constructors_in_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base1 B = new Base1();
		B.setX(55);
		System.out.println(B.getX());
		
		Derived1 d1 = new Derived1();
		
		
	}

}
