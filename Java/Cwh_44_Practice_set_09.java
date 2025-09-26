package company;

//1) Create a class cylinder and use getters and setters to set its radius and height.

	class Cylinder
	{
		private int radius;
		private int height;
		
// 3)  Use constructor and repeat 1.ques. 
		public Cylinder(int myradius,int myheight)
		{ 
			radius=myradius;
			height=myheight;
		}
		
// end of ques 3.
		
		public void setradius(int radius)
		{
			this.radius =radius;
		}
		public int getradius()
		{
			return radius;
		}
		
		
		public void setheight(int height)
		{
			this.height =height;
		}
		public int getheight()
		{
			return height;
		}

		// 2) Create 1) to calculate surface area and volume of  the cylinder.
		
		public double surfaceArea()
		{
			return 2*Math.PI*radius*radius+ 2*Math.PI*radius*height;   // Math.pi for exact pi value
		}
		
		public double volume()
		{
			return Math.PI*radius*radius*height;
		}
		
	}
	// 4) overload a constructor used to initialize a rectangle to length 4 and breath 5 for using custom parameters.
	
	class Rectangle1
	{
		private int length;
		private int breath;
	
	public Rectangle1()
		{
			this.length = 4;
			this.breath = 5;
		}
	
	public Rectangle1(int length , int breath)
	{ 
		this.length = length;
		this.breath = breath;
	}
	
	
	public int getlength()
	{
		return length;
	}
	
	public int getbreath()
	{
		return breath;
	}
	
	}	
	
	
	// 5)	Repeat 1 for sphere
	
	class Sphere
	{
		private int radius;
		public char[] getradius1;
	
	public Sphere()
	{
		 radius = 5;
	}
	public Sphere(int myradius)
	{
		 radius = myradius;
	}
	
	public int getradius1()
	{
		return radius;
				
	}
	public void  setradius1(int radius)
	{
		this.radius=radius;		
	}
	
	public double surfaceArea1()
	{
		return  4*Math.PI *radius*radius;
	}
	public double volume1()
	{
		// return  4/3*Math.PI*radius*radius*radius;  // not giving accurate value
		return	1.333*Math.PI*radius*radius*radius;
	}
	 
	}
	
public class Cwh_44_Practice_set_09{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1) Create a class cylinder and use getters and setters to set its radius and height.
		
		Cylinder mycylinder = new Cylinder(9,12);         // /3)  Use constructor and repeat 1.ques. 
		
//		mycylinder.setheight(12);
//		System.out.println(mycylinder.getheight());
//		
//		mycylinder.setradius(9);
//		System.out.println( mycylinder.getradius());
		

// 2)  Create 1) to calculate surface area and volume of  the cylinder.
		
		System.out.println(mycylinder.surfaceArea());
		System.out.println(mycylinder.volume());
		
		
// 3)  Use constructor and repeat 1.ques. 
	
// 4) overload a constructor used to initialize a rectangle to length 4 and breath 5 for using custom parameters.
	
	

		
	//	Rectangle1 r = new Rectangle1();
		Rectangle1 r = new Rectangle1(12,56);
		System.out.println(r.getlength());
		System.out.println(r.getbreath());
		
		
// 5)	Repeat 1 for sphere
		
		Sphere sph = new Sphere();
		//Sphere sph = new Sphere(2);
		
		System.out.println(sph.surfaceArea1());
		System.out.println(sph.volume1());
	//	System.out.println();
	//	System.out.println();

	}
	
}
