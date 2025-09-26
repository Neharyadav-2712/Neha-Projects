package company;

public class Cwh27_for_Each_loop_injava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int [] marks = {99,34,55,66,77};
//		float [] marks = {99.6f,34.8f,55.8f,66.3f,77.2f};
//		String [] students = {"neha","kaustubh","Naveen","sachin","rohit"};
//		System.out.println(marks.length);
//		System.out.println(students[2]);
		
		
		int [] marks = {99,34,55,66,77};
	//	System.out.println(marks.length);
		
		// Displaying the array (naive way --simple way)
//		System.out.println("Printing using naive way");
//		System.out.println(marks[0]);
//		System.out.println(marks[1]);
//		System.out.println(marks[2]);
//		System.out.println(marks[3]);
//		System.out.println(marks[4]);
//		
		// Displaying the array using for loop
//		System.out.println("Printing using for loop");
//		
//		for(int i=0; i<marks.length; i++)
//		{
//			System.out.println(marks[i]);
//		}
		
		// Quick Quiz-------Displaying array in reverse order using for loop
		
		System.out.println("Printing using for loop in reverse order");
		for(int i=marks.length-1; i>=0; i--)
		{
			System.out.println(marks[i]);
		}
		
		
		// Quick Quiz-------Displaying array using for each loop
		
				System.out.println("Printing using for each loop");
				for(int element:marks)
				{
					System.out.println(element);
				}
	}

}
