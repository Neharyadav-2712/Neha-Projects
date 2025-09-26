package company;


// 1) Create a class Employee with following propertis and methods.

class Emp
{
	int salary;
	String name;
	
	
	public int getSalary()
	{
		return salary;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
		 name = n;
	}
	
}


// 2)  Create a class cellphone with methods to print "ringing...." , "Vibrating..." etc.

class CellPhone
{
	public void ring()
	{
		System.out.println("Ringing..........");
	}
	
	
	public void vibrat()
	{
		System.out.println("Vibrating........");
	}
}


//3) create a class square with a method to initialize its side,calculating area ,parameter etc.


class Square
{
	int side;
	public int area()
	{
		return side*side;
	}
	
	public int parimeter() 
	{
		return 4*side;
	}
}

//4) create a class rectangle with a method to initialize.Reapeate 3.

class Rectangle
{
	int length;
	int width;
	public int area()
	{
		return length*width;
	}
	
	public int parimeter()
	{
		return 2*(length+width);
	}
	
}

//5) create a class TommyVecetti for Rockstar Games capable of hitting (print hitting.....), running, firing etc.	

class Tommy
{
	public void hit()
	{
		System.out.println("hitting...........");
	}
	
	public void run()
	{
		System.out.println("running............");
	}
	
	public void fire()
	{
		System.out.println("firing............");
	}
	
}


//6) Repeat 4 for a circle.

class Circle
{
	float radius;
	public float area()
	{
		return 3.14f*radius*radius;
	}
	
	public float circumference()
	{
		return 2*3.14f*radius;
	}
}
public class Cwh_39_cwh_chapter8_practice_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Emp neha = new Emp();
		neha.setName("Kajal");
		neha.salary =55;
		System.out.println(neha.getSalary());
		System.out.println(neha.getName());
		
		//int salary = neha.getSalary();
		
		
// 2)  Create a class cellphone with methods to print "ringing...." , "Vibrating..." etc.
		
		CellPhone vivo = new CellPhone();
		vivo.ring();
		vivo.vibrat();

// 3) create a class square with a method to initialize its side,calculating area ,parameter etc.
		
		Square sq = new Square();
		sq.side=5;
		System.out.println(sq.area()); 
		System.out.println(sq.parimeter());
		
// 4) create a class rectangle with a method to initialize.Reapeate 3.
		
		Rectangle rect = new Rectangle();
		 rect.length=2;
		 rect.width=3;
			System.out.println(rect.area());
			System.out.println(rect.parimeter());

// 5) create a class TommyVecetti for Rockstar Games capable of hitting (print hitting.....), running, firing etc.	
			
			Tommy tom = new Tommy();
			tom.hit();
			tom.run();
			tom.fire();
			
			
// 6) Repeat 4 for a circle.
			
			Circle cir = new Circle();
		cir.radius =30f;
			System.out.println(cir.area());
			System.out.println(cir.circumference());
	}

}

