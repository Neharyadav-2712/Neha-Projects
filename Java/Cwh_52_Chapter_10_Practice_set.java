package company;

// 1) Create a class circle and use inheritance to create another class cylinder from it.

class Circle3
{
	public int radius;
	
	Circle3()
	{
		System.out.println("I am circle Non-parameterised constructor.");
	}
	Circle3(int r)
	{
		System.out.println("I am circle parameterised constructor.");
		this.radius = r;
	}
	public double area()
	{
		return Math.PI*this.radius*this.radius;
	}
}

//2) Create a class Rectangle and use inheritance to create another class cuboid.Try to keep it as close to real world scenario as possible.( same as 1)


//3) Create a methods for area and volume in ques.1.


//4) Create a 


//5) Create a

class Cylinder3 extends Circle3
{
	
	public int height;
	Cylinder3(int h, int r)
	{
		super(r);
		System.out.println("I am Cylinder parameterised constructor.");
		this.height = h;
	}
	
	public double volume()
	{
		return Math.PI*this.radius*this.radius*this.height;
	}
}
public class Cwh52_Chapter_10_Practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// 1) Create a class circle and use inheritance to create another class cylinder from it.
	//	Circle3 C1 = new Circle3(12);
		Cylinder3 C = new Cylinder3(12,4);	
		
		//2) Create a class Rectangle and use inheritance to create another class cuboid.Try to keep it as close to real world scenario as possible. ( same as 1)
		
	}

}
