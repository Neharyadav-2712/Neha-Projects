package company;

import java.util.ArrayList;
import java.util.*;

public class Cwh92_LinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> l1 = new LinkedList<>();
		
		LinkedList<Integer> l2 = new LinkedList<>();

		
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
			
			l1.addFirst(2712); // Inserts the specified element at the beginning of this list.
			
			l1.addLast(1997); // Appends the specified element to the end of this list.
			
		System.out.println(l1.contains(15));  // return true is this list contain specified element.
		System.out.println(l1.indexOf(6));    // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
		System.out.println(l1.lastIndexOf(6)); // Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
		

		//	l1.set(0, 200);  // Replaces the element at the specified position in this list with the specified element.
		
			for(int i=0 ; i<l1.size(); i++)
			{
				// get method
				
				System.out.print(l1.get(i));  // get is use to print array 
				System.out.print(",");
			}
	}

}
