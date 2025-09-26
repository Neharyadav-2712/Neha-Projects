package company;


//class Employee{
//	int id;
//	int salary;
//	String name;
//	
//	
//	public void printDetails()
//	{
//		System.out.println("My id is " + id);
//		System.out.println("My name is " + name);
//		System.out.println("My salary is " + salary);
//	}
//	
//	public int getsalary()
//	{
//		return salary;
//	}
//}

// lect 39  Ques 1) 

//class Employee{
//	
//int salary;
//String name;
//
//public int getSalary()
//{
//	return salary;
//}
//
//public String getName()
//{
//	return name;
//}
//
//public void setName(String n)
//{
//	name = n;
//}
//}
//
//// ques 2
//
//class Cellphone{
//	
//	public void ring()
//	{
//		System.out.println("It's Ringing");
//	}
//	
//	public void vibrate()
//	{
//		System.out.println("It's Vibrating");
//	}
//}
//
////ques 3
//class Squa
//{
//	
//	int side;
//	
//	public int  area()
//	{
//		return side*side;
//	}
//	public int perimeter()
//	{
//		return side*4;
//	}
//}
//
////ques 4 
//
//class Reactangle{
//	
//	int length;
//	int breath;
//
//	public int  area1()
//	{
//		return length*breath;
//	}
//	public int perimeter1()
//	{
//		return 2*(length+breath);
//	}
//}
//
//
////ques 5
//
//class TommyVecetti{
//	
//	public void run()
//	{
//		System.out.println("Running");
//	}
//	
//	public void hit()
//	{
//		System.out.println("Hitting");
//	}
//	
//	public void fire()
//	{
//		System.out.println("Firing");
//	}
//}

//ques 6

//class Circlr
//{
//  double radius;
//	public double area2()
//	{
//		return Math.PI*radius*radius;
//	}
//	public double perimeter2()
//	{
//		return 2*(Math.PI*radius);
//	}
//	
//}

// class MyEmployee1
//{
//	private int id;
//	private String name;
//	
//	
//	public String getName()
//	{
//		return name;
//	}
//	public void setName(String n)
//	{
//		name = n;
//	}
//	
//	public int getId()
//	{
//		return id;
//	}
//	public void SetId(int i)
//	{
//		 id = i;
//	}
//
//}
 
// Lec 42

// class MyEmployee1
//{
//	private int id;
//	private String name;
//	public  MyEmployee1()
//	{
//		id = 55;
//		name = "fdgdg";
//	}
//	
//	public  MyEmployee1(int n ,String myname)
//	{
//		id = n;
//		name = myname;
//	}
//	
//	public String getName()
//	{
//		return name;
//	}
//	public void setName(String n)
//	{
//		name = n;
//	}
//	
//	public int getId()
//	{
//		return id;
//	}
//	public void SetId(int i)
//	{
//		 id = i;
//	}
//
//}
 


// ps  9 ques 1

// class Cylinder1
// {
//	 private int height;
//	 private int radius;
//	
//	// ques 3 
//	public Cylinder1()
//	{
//		height = 6;
//		radius = 4;
//	}
//		
//		public int getheight()
//		{
//			return height;
//		}
//		public void setheight(int x)
//		{
//			height = x;
//		}
//		
//		public int getradius()
//		{
//			return radius;
//		}
//		public void Setradius(int y)
//		{
//			radius = y;
//		}
//		
//// ques 2 
//		
//		public double surfaceArea()
//		{
//			return  2*Math.PI*radius*radius + 2*Math.PI*radius*height;
//		}
//		public double volume()
//		{
//			return	Math.PI*radius*radius*height;
//		}
// }
 
//ques 4
// 
// class Reactangle{
//	 
//	 private int length;
//	 private int breadth;
//	 
//	 public Reactangle()
//	 {
//		  length = 4;
//		  breadth = 6;
//		  
//	 }
//	 
//	 public int getlength()
//	 {
//		 return length;
//	 }
//	 public void Setlength(int n)
//	 {
//		 length = n;
//	 } 
//	 public int getbreadth()
//	 {
//		 return breadth;
//	 }
//	 public void Setbreadth(int x)
//	 {
//		 breadth = x;
//	 } 
// }

 // ques 5
 

 class Sphere1
 {
	 private int radius;
	
	// ques 3 
	public Sphere1()
	{
		radius = 5;
	}
		public int getradius()
		{
			return radius;
		}
		public void Setradius(int y)
		{
			radius = y;
		}
		public double surfaceArea()
		{
			return  4*Math.PI*radius*radius;
		}
		public double volume()
		{
			//return	(4/3)*Math.PI*radius*radius*radius;
			return	1.333*Math.PI*radius*radius*radius;
		}		
 }	
public class Cwh_Practice_of_Custom_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Employee kajal =new Employee();
//		Employee nehu =new Employee();
//	
//		kajal.id =12;
//		kajal.name="Neha";
//		kajal.salary=350;
//		
//		nehu.id = 45;
//		nehu.name =	"Vedu";	
//		nehu.salary=550;
//				
//		kajal.printDetails();
//		nehu.printDetails();
//	 kajal.getsalary();
//	nehu.getsalary();
		
		
//	Employee kajal =new Employee();
//	kajal.setName ("Nehayadav");
//	kajal.salary=55;
//	System.out.println(kajal.getName());
//	System.out.println(kajal.getSalary());	
//
//	Cellphone phone = new Cellphone();
//	phone.ring();
//	phone.vibrate();
//	
//	Squa sql = new Squa();
//
//	sql.side = 3;
//	System.out.println(sql.area());
//	System.out.println(sql.perimeter());
//	
//	Reactangle rect = new Reactangle();
//	
//	rect.length = 3;
//	rect.breath = 4;
//	System.out.println(rect.area1());
//	System.out.println(rect.perimeter1());
//	
//	TommyVecetti tom = new TommyVecetti();
			
//	tom.run();
//	tom.hit();
//	tom.fire();
	
//	Circlr cir = new Circlr();
//	cir.radius=5;
//	System.out.println(cir.area2());
//	System.out.println(cir.perimeter2());
//
//		MyEmployee1 emp = new MyEmployee1();
////		emp.id=5;
////		emp.name = "Nehu";
//		
//		emp.setName("Neha");
//		emp.SetId(5);
//		
//		System.out.println(emp.getName());
//		
//		System.out.println(emp.getId());
		
		
//		MyEmployee1 my = new MyEmployee1();
//	//	MyEmployee1 my = new MyEmployee1(60, "dsgdfggfd");
////	my.SetId(33);
////	my.setName("fdsfs");
//	System.out.println(my.getId());
//	System.out.println(my.getName());
	
		// ques 1 
//		Cylinder1 cyn = new Cylinder1();
//	cyn.setheight(12);
//	System.out.println(cyn.getheight());
//	cyn.Setradius(9);
//	System.out.println(cyn.getradius());
//	// ques 2 	
//	System.out.println(cyn.surfaceArea());
//	System.out.println(cyn.volume());
	
	// ques 3
	
//	System.out.println(cyn.getheight());
//	System.out.println(cyn.getradius());
	
	// ques 4
		
		
	//	Reactangle rect = new Reactangle();
	//	System.out.println(rect.getlength());
	//	System.out.println(rect.getbreadth());
		
	// ques 5	
		
	Sphere1 spe = new Sphere1();
	System.out.println(spe.surfaceArea());
	System.out.println(spe.volume());
}
}
