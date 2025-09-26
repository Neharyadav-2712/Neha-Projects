package company1;

class MyEmployee
{
	private int id;
	private String name;
	
public String getname()
{
	return name;
}
public void setname(String n)
{
	 this.name = n;
}
public int getid()
{
	return id;
}
public void setid(int a)
{
	this.id = a;
}

}
public class Cwh40_Getters_and_Setters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEmployee Emp = new MyEmployee();
		
		Emp.setname("Vedu");
		Emp.setid(55);
		
		System.out.println(Emp.getname());
		System.out.println(Emp.getid());
		
	}

}
