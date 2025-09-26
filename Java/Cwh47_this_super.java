package company;
class Ekclass
{
	int a;
	Ekclass(int a)
	{
		this.a = a;
	}
	public int getA()
	{
		return a;
	}
	public int returnone()
	{
		return 1;
	}
}
class Doclass extends Ekclass
{
	Doclass (int c)
	{
		super(c);
		System.out.println("I am a constructor");
	}
}
public class Cwh47_this_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Ekclass e = new Ekclass(335);
		Doclass d = new Doclass(0);
		System.out.println(e.getA());
		
	}
	
}
