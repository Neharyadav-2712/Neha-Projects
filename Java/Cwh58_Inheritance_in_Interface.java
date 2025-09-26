package company;

interface sampleInterface
{
	void meth1();
	void meth2();
}
interface childSampleInterface extends sampleInterface
{
	void meth3();
	void meth4();
}

class MySampleInterface  implements childSampleInterface
{

	@Override
	public void meth1() {
		System.out.println("Meth1");
		
	}

	@Override
	public void meth2() {
		System.out.println("Meth2");
		
	}

	@Override
	public void meth3() {
		System.out.println("Meth3");
		
	}

	@Override
	public void meth4() {
		System.out.println("Meth4");
		
	}
	
}

public class Cwh_58_Inheritance_in_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySampleInterface obj = new MySampleInterface();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();

	}

}
