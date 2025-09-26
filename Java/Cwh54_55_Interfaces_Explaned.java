package company;

interface Bicycle
{
	int a = 45;
	void applyBreak(int decrement);
	void speedUp(int increment);
}

interface HornBicycle
{
	
	void blowHorn3g();
	void blowHornhn();
}

class AvonCycle implements Bicycle , HornBicycle
{
	int x =44;
	void blowHorn()
	{
		System.out.println("Pee Pee Poo Poo");
	}
	
	public void blowHorn3g()
	{
		System.out.println(" Kabhi Khushi kabhi gum pee pee pee pee");
	}
	public void blowHornhn()
	{
	 System.out.println("Main hoon n po po po po");
	}
	
	
	public void applyBreak(int decrement)
	{
		System.out.println("Applying Break");
	}
	public void speedUp(int increment)
	{
		System.out.println("Applying Speedup");
	}
}


public class Cwh54_55_Interfaces_Explaned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AvonCycle cycle = new AvonCycle();
		cycle.applyBreak(1);
		// you can create properties in interfaces.
		System.out.println(cycle.a);
		// you can not modify the properties in interfaces as they are final.
		// cycle.a = 344;
		// System.out.println(cycle.a);
		
		cycle.blowHorn3g();
		cycle.blowHornhn();
		
		
		
	}

}
