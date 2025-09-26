package company;

class A
{
	public int a;
	public int harry()
	{
     return 4;	
	}
	
	public void math2()
	{
		System.out.println("I am method 2 of class A");
	}
}


class B extends A
{
	@Override
	public void math2()
	{
		System.out.println("I am method 2 of class B");
	}
	
	public void math3()
	{
		System.out.println("I am method 3 of class B");
	}
}

public class Cwh48_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		A a = new A();
		a.math2();
		
		B b = new B();
		b.math2();
	}

}

 
