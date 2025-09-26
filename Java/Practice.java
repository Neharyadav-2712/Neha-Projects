package company1;
import java.util.*;


public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Integer> l1 = new ArrayList<>();
		
		LinkedList<Integer> l1 = new LinkedList<>();
		
		l1.add(0,13);;
		l1.add(33);
		l1.add(44);
		l1.add(55);
		l1.add(66);
		l1.add(77);
	
		//ArrayList<Integer> l2 = new ArrayList<>();
		
		LinkedList<Integer> l2 = new LinkedList<>();
		
		l2.add(22);
		l2.add(33);
		l2.add(44);
		l2.add(55);
		l2.add(66);
		l2.add(77);
		
//		LinkedList<String> l3 = new LinkedList<>();
//		l3.add("aws ");
//		l3.add("java ");
//		l3.add("spring ");
//		
//		 
//		System.out.println("The size of L1 " + l1.size());
//		
//		int sum=0;
//		for(int i=0; i<l1.size(); i++)
//		{
//			//System.out.print(l1.get(i));
//			//System.out.print(",");
//			sum+= l1.get(i);
//		}
//		System.out.println(sum);
//		System.out.println("The size of L2 " + l2.size());
//		
//		for(int i=0; i<l2.size(); i++)
//	{
//			System.out.print(l2.get(i));
//			System.out.print(",");
//		}
//		System.out.println(l1.get(0));
//		
//		l1.addAll(l2);
//		System.out.println(l1);
//		
//		
//		l1.clear();
//		System.out.println(l1);
//		
//		System.out.println(l2.contains(77));
//		
//		System.out.println(l2.indexOf(66));
//		
//	//	System.out.println(l2.lastIndexOf(77));
//		
//		l2.set(0,99);
//		
//		System.out.println(l2);
//		
//
////l3.stream().map(String::toUpperCase).forEach(System.out::print);
		
		
		l1.addFirst(88);
		l1.addLast(90);
		System.out.println(l1);
		
	}
}
