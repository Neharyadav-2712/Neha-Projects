package company;
import java.util.*;

public class Cwh91_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> l1 = new ArrayList<>();
	
	ArrayList<Integer> l2 = new ArrayList<>(5);

	
	// add method
	
	l2.add(11);
	l2.add(12);
	l2.add(13);
	
	
	// add method
	
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(6);
		l1.add(5);
		l1.add(6);
		
	// add at specific position
		
		l1.add(2,5);
		
	//	l1.addAll(0,l2);    // Adding in starting
		
		l1.addAll(l2);    // Adding in last
		
	//	l1.clear();       // Use to remove all the element in the list.
		
	System.out.println(l1.contains(15));  // return true is this list contain specified element.
	System.out.println(l1.indexOf(6));    // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	System.out.println(l1.lastIndexOf(6)); // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	

		l1.set(0, 200);  // Replaces the element at the specified position in this list with the specified element.
	
		for(int i=0 ; i<l1.size(); i++)
		{
			// get method
			
			System.out.print(l1.get(i));  // get is use to print array 
			System.out.print(",");
		}
	}

}
