package company;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Cwh26_arrays {
	
//	private static long facto(long n)
//	{
//		int fact=1;
//		while(n>1)
//		{
//			System.out.println(n);
//			fact *=n;
//			n--;
//		}
//		System.out.println("*********************    " + fact);
//		return fact;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// classroom of 500 student -- you have to store marks of these 500 student
//		you have two option
//		1)create 500 variable
//		2) use arrays(recommended)
		
	// There are 3 main ways to create an array in java.	
		
	//	1).Declaration and memory allocation.
	//	int [] marks = new int[5];
		
    //	2).Declaration and then memory allocation.	
		
//		int [] marks;
//		marks = new int[5];
//		
//		// Initialization
//		
//		int [] marks = new int[5];
//		marks[0]=100;
//		marks[1]=100;
//		marks[2]=100;
//		marks[3]=100;
//		marks[4]=100;
//		marks[4]=150;
//		//marks[5]=44; // throws an error
//		System.out.println(marks[0]);
		
	//	3).Declaration , memory allocation and initialization together

		int [] marks = {5,8,2,1,9,2,1};
//		long [] marks = {5,2,1};
	//	System.out.println(marks[4]);
//		int max = 0;
//		int min = Integer.MAX_VALUE;
//		for(int element:marks)
//		{
////			if(element > max)
////			{
////				max = element;
////			}
//			
//			//max =(element > max)?element:max;
//			
//			min =(element < min)?element:min;
//			
//		}
//		System.out.println(max);
//		System.out.println(min);
		
		IntStream intst = Arrays.stream(marks);
		//System.out.println(intst.reduce(Integer.MIN_VALUE, (a,b)-> a>b?a:b));
//		System.out.println(intst.filter(n->n%2!=0).reduce(0, (a,b)->a+b));
		intst
//		.map(Cwh_26_arrays::facto)
				.map((n)->{
			int temp =1;
			while(n>=1)
			{
				temp *=(n);
				n--;
			}
			return temp;
		})
		.forEach(System.out::println);
		
	}

}
