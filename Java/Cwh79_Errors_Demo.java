package company1;
import java.util.*;

public class CWH79_Errors_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// 1) Syntax error in Java 
		
		int a = 5;
		//b=3;
		//System.out.println(a)
		//System.out.println(a+b)
		
		
		// 2)  Logical Error
		// Print all prime no.
		
		System.out.println(2);
		for(int i=1; i<5; i++)
		{
		System.out.println(2*i+1);
		}
		
		// 3)  RunTime Error OR Exception
		
		int k;
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		System.out.println("Interger part of 1000 divided by K is " + 1000/k);
		
		
	}

}
