package company;

import java.util.Scanner;

public class Cwh_Practice_By_Navya {

	static int factorial(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}
	}
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
// Reverse Number
		
		
//		int num = 1234;
//		int reverse = 0;
//		int temp = num;
//		int last = 0 ;
//		
//		
//		while(temp!=0)
//		{
//			last = temp%10;
//			temp = temp/10;
//			reverse = reverse*10 + last; 
//			
//		}
//		
//		System.out.println(reverse);
		
//  Spy number	
		
//		System.out.println("Enter the number you want");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		int sum=0;
//		int last = 0;
//		int mul=1;
//		while(num!=0)
//		{
//			last = num%10;
//			num = num/10;
//			sum = sum+last;
//			mul= mul*last;
//			
//		}
//		System.out.println("The sum of number is:" + sum);
//		System.out.println("The Multiplication of number is:" + mul);
//		if(sum==mul) {
//			System.out.println("The no. is spy");
//		}
//		else
//		{
//			System.out.println("The no. is not spy");
//		}
		
// Special number
		
//	System.out.println("Enter the number you want");
//	Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//			int sum=0;
//			int last = 0;
//			int mul=1;
//			int factorial=num;
//			int result = 1;
//			while(num!=0)
//			{
//				last = num%10;
//				num = num/10;
//			   result= factorial(last);
//			   sum +=result;
//				
//			}
//			System.out.println("The sum of factorial of number is:" + sum);
//			if(sum==factorial) {
//				System.out.println("The given no. is Special Number");
//			}
//			else
//			{
//				System.out.println("The given no. is not Special Number");
//			}
			
// armstrong numbers
		
		
		System.out.println("Enter the number you want");
		Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
				int temp = num;
				int last = 0;
				int res = 0;
				int count = 0;
				while(num!=0)
				{
					last = num%10;
					num = num/10;
					res = res*10 + last;
					count++;
				}
				while(res!=0)
				{
					res = last%10;
					last=last/10;
					res = (int) Math.pow(last, count);
				}
					
				if(res==num)	
				{
					System.out.println("Number is Armstrong");
				}
				else	
					{
						System.out.println("Number is Not Armstrong");
					}
								
						
	}
	
	
}
