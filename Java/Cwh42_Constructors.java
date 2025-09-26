package company;

class MyMainEmployee{
private	int id;
private	String name;


public MyMainEmployee()
{
	name = "your Name";
	id = 33;
}

// Passing Arguments

public MyMainEmployee(String myname , int myid)   //   creating constructor
{
	name = myname;
	id = myid;
}
public MyMainEmployee(String myname)   //   creating constructor
{
	name = myname;
	id = 1;
}
public String getName()
{
	return name;
}
public void setName(String n)
{
	this.name = n;
}

public void setId(int i)
{
	this.id = i;
}

public int getid()
{
	return id;
}
}

//Quiz Quiz:- overload the employee constructor to initialize the salary to Rs10000.

//class MyMain1Employee
//{
//	private	int id;
//	
//	public MyMain1Employee(int i)
//	{
//	  id = i;
//	}
//
//	public int getid1()
//	{
//		return id;
//	}
//	public void setid1(int i)
//	{
//		 id = i;
//	}
//}
public class Cwh_42_Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	MyMainEmployee neha = new MyMainEmployee("Kajal", 67);
		MyMainEmployee neha = new MyMainEmployee();
		//neha.setName("vedu");--------------not required
		//neha.setId(45);--------------not required
		System.out.println(neha.getid()); // using constructor
		System.out.println(neha.getName());  // using constructor

// Quiz Quiz:- overload the employee constructor to initialize the salary to Rs10000.
		
	//	MyMain1Employee nnn = new MyMain1Employee();
	//	MyMain1Employee nnn = new MyMain1Employee(89000); // passing arguments
	//	System.out.println(nnn.getid1());
		

	}
	
}


