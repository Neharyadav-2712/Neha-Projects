package company1;


// Problem 1

class Employee
{
	int salary;
	String name;
	
	public int getsalary()
	{
		return salary;
	}
	public String getname()
	{
		return name;
	}
	
	 public void setName(String n)
	{
		 name = n;
	}
}

public class Cwh39_Chapter8_PracticeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
		Employee Em = new Employee();
		
		Em.setName("Kaveri");
		Em.salary = 44000;
		
		System.out.println(Em.getsalary());
		System.out.println(Em.getname());
		
	}

}
