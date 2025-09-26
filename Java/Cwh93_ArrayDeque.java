package company1;
import java.util.ArrayDeque;

public class Cwh93_ArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque<Integer> ad1 = new ArrayDeque<>();
		
		ad1.add(33);
		ad1.add(55);
		ad1.add(22);
		ad1.addFirst(99);
		
		System.out.println(ad1.getFirst());
		System.out.println(ad1.getLast());
	}

}
