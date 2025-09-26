package company;

 class Employee{
	 int id;
	 String name;
	 int salary;
	
	
	public void printDetails()
	{
		System.out.println("My id is " + id);
		System.out.println("My name is " + name);	
	}
	
	public int getSalary()
	{
		return salary;
	}
}

public class Cwh_38_custom_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is our custom class");
		
		Employee harry = new Employee();
		Employee john = new Employee();
		
		harry.id = 12;
		harry.name = "neha";
		harry.salary = 22;
		
		john.id = 22;
		john.name ="Kajal";
		john.salary =33;
		
//		System.out.println(harry.id);
//		System.out.println(harry.name);
		
		harry.printDetails();
		john.printDetails();
		
		int salary = harry.getSalary();
	//	int salary = john.getSalary();
		System.out.println(salary);
	}


	}


