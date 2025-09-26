package company1;

class Phone
{
	public void greet()
	{
		System.out.println("Good Morning!");
	}
	
	public void name()
	{
		System.out.println("My name is Neha");
	}
}

class SmartPhone extends Phone
{
	public void swagat()
	{
		System.out.println("Aapka swagat hai!");
	}
	
	public void name()
	{
		System.out.println("My name is Neha in class phone");
	}
}
public class Cwh49_Dynamic_Method_Dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SmartPhone s = new SmartPhone();
//		s.name();
//		
//		
//		phone p = new phone();
//		p.name();
		
		
		Phone s1 = new SmartPhone();
		s1.name();
		s1.greet();
	}

}
