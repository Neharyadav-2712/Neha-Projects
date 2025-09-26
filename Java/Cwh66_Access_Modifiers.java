package company1;

  class c1
{
	public int x=5;
	protected int y =10;
	int z=3;
	private int a =1;
	
//All access modifier Use in same class
	
	public void math1()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
	}

}
  
public class Cwh66_Access_Modifiers {

	public static void main(String[] args) {

		c1 cc = new c1();
		
	//All access modifier in packageUse except but private.
		
	System.out.println(cc.x);
	System.out.println(cc.y);
	System.out.println(cc.z);
	//System.out.println(cc.a);
		
	}

}
