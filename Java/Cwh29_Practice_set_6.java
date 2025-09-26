package company;
import java.util.*;


public class Cwh_29_Practice_set_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		1) create array of 5 float and calculate there sum.

//       float [] marks; 
//		
//		marks= new float [5];
//		float sum =0;
//		float [] marks= {50.44f,60.4f,75.2f,90.8f,85.1f};
//		for(int i=0;i<marks.length;i++)
//		{
//			sum= sum+marks[i];
//		}
//		System.out.println(sum);
		
		
//		or 
//		float [] marks= {50.44f,60.4f,75.2f,90.8f,85.1f};
//		float sum =0;
//		for(float element:marks)
//		{
//		
//			sum= sum+element;
//		}
//		System.out.println(sum);
		
		
		
//		2) Given integer is present or not in array.
		
//		float [] marks= {50.44f,60.4f,75.2f,90.8f,85.1f};
//		float num = 90.8f;
//		boolean inarray = false;
//		for(float element:marks)
//				{
//				if(num == element) 
//				{
//				inarray=true;
//				break;
//				}
//			
//				}
//		
//		if(inarray)
//		{
//			System.out.println("The value is present in the array");
//			}
//			else
//			{
//				System.out.println("The value is not present in the array");
//			}	
		
		
//		3) calculate average marks from an array using for each loop. ( add all value the divide by total number of marks)
		
       
//		float sum =0;
//		float [] marks = {50.44f,60.4f,75.2f,90.8f,85.1f};
//		for(int i=0;i<marks.length;i++)
//		{
//			//sum= sum+(marks[i]/marks.length);
//			sum= sum+(marks[i]);
//		}
//		//System.out.println(sum);
//		System.out.println("The value of avg marks is " + sum/marks.length);
		
		
//		4) Add two matrices and add them
		
//	int [][] mat1 = {{3,5,6},
//	                 {3,5,8}};
//	
//	int [][] mat2 = {{2,5,7},
//                     {3,1,6}};
//	
//	int [][] result = {{0,0,0},
//                      {0,0,0}};
//	
//	for(int i=0; i<mat1.length;i++) // row number of times (2 times)
//	{
//		for(int j=0; j<mat1[i].length;j++)  // coloum number of times (3 times)
//		{
//	            result[i][j]= mat1[i][j] + mat2[i][j];
//	            System.out.print(result[i][j]+" ");      
//		}
//		 System.out.println("");   
//	}
	
//	5) write a java program to reverse the array

//	int result;	
//	int [] num = {99,34,55,66,77};
//	{
//		for(int i= num.length-1; i>=0; i--)
//		{
//	    // System.out.print(num[i] + " ");
//			 System.out.println(num[i]);
//		}	
//	}
		
	//	Or
		
//	int [] arr = {99,34,55,66,77};
//	int l = arr.length;
//	int temp;
//	int n = Math.floorDiv(l, 2);
//	for(int i=0 ; i<n; i++)
//	{
//		// swap arr[i] and arr[l-1-i]
//		// a  b   temp
//		// |4| |3|  ||
//		temp = arr[i];
//		arr[i]=arr[l-1-i];
//    	arr[l-1-i]=temp;
//
//	}
//	for (int element:arr)
//	{
//		System.out.println(element + " ");
//	}
//		
	
//	6) Find maximum element in array

//			int [] arr = {33,12,764,88,487,464564};
//			int max=0;
//			for(int e :arr)
//			{
//				
//			if(e>max)
//			{
//				max=e;
//			}
//			}
//			System.out.println("The maxmum element is "+ max);
		
		
		
// By NEHA NOT CONFIRM
//		int Maximum=0;
//	int[] arr = {344,234,34,45,22,665,7657,654654645}; 
//	{
//		for(int i=0; i<arr.length; i++)
//		{
//		 Maximum = Math.max(arr[0], arr[arr.length-1]);
//			
//		}
//		System.out.println(Maximum);
//	}
	
	
	
//	7) Find minimum  element in array
	
		
	//	System.out.println(Integer.MIN_VALUE);  //-2147483648
	
	//	System.out.println(Integer.MAX_VALUE); //	214748364
		
		
//			int [] arr = {2,6,33,12,764,88,487,464564};
//			int min=Integer.MAX_VALUE;
//			for(int e :arr)
//			{
//				
//			if(e<min)
//			{
//				min=e;
//			}
//			}
//			System.out.println("The minumum element is "+ min);

	
	
//	8) Array is sorted or not
	        boolean isSorted = true;
			int [] arr = {2,6,33,12,764,88,487,464564};
			for(int i=0; i<arr.length-1; i++)
			{
				if(arr[i] > arr[i+1]) {
					isSorted =false;
				break;
			}
			}	
			if(isSorted) {
				System.out.println("Array is Sorted");
			}
			else
			{
				System.out.println("Array is not Sorted");
			}
	
	
}
}
