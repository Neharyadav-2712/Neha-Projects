package company1;

class Base
{
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

class Derived extends Base
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

public class Cwh45_Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base bas1 = new Base();
//		bas1.setY(30);        // throw the error
//		System.out.println(bas1.getY());  // throw the error
		
//		bas1.setX(33);
//		System.out.println(bas1.getX());
		
		Derived der1 = new Derived();
				
//		der1.setX(33);
//		System.out.println(der1.getX());
		
		der1.setY(30);
		System.out.println(der1.getY());
		
// Problem 1:- create a class animal and derived another class dog from it.	
		
	}
}
