package company1;
import java.util.*;

public class Cwh19_PracticeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Problem 1
//		
//		int a = 10;
//		if(a == 11)
//		{
//			System.out.println("I am 11");
//		}
//		else
//		{
//			System.out.println("I am not 11");
//		}
//		// Problem 2
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int sub1,sub2,sub3;
//		System.out.println("Enter the marks out of 100 for 1st sub");
//		sub1 = sc.nextInt();
//	
//		System.out.println("Enter the marks out of 100 for 2nd sub");
//		sub2 = sc.nextInt();
//		
//		System.out.println("Enter the marks out of 100 for 3rd sub");
//		sub3 = sc.nextInt();
//		 
//		float sum = sub1+sub2+sub3;
//		System.out.println("sum of all subject is " +" "+sum);
//		float Avg = (sum/300*100);
//		System.out.println("The Avg percentage is " +" "+Avg);
//		
//		if(Avg>=40 && sub1 >= 33 && sub2 >= 33 && sub3 >=33)
//		{
//			System.out.println("Congratulations is pass!");
//		}
//		else
//		{
//			System.out.println("Sorry to regreat, you are fail!");
//		}
//		{
//			
//		}
		// Problem 3
		
//		System.out.println("Enter your income");
//		Scanner sc1 = new Scanner(System.in);
//		
//		float income = sc1.nextFloat();
//		
//		float tax = 0;
//		
//		if(income < 2.5f)
//		{
//			tax = tax +0;
//		}
//		else if(income > 2.5f && income < 5f)
//		{
//			tax = tax + 0.05f*(income-2.5f);
//		}
//		else if(income > 5f && income < 10f)
//		{
//			tax =  tax + 0.05f*(5f - 2.5f); 
//			tax = tax + 0.2f*(income - 5f);
//		}
//			
//		else if(income > 10.0f)
//		{
//			tax =  tax + 0.05f*(5f - 2.5f) ; 
//			tax = tax + 0.2f*(10f - 5f);
//			tax = tax + 0.3f*(income - 10f);
//				
//		}
//		
//		System.out.println("Tax paid by employed is: " + tax);
		
		// Problem 4
		
//		System.out.println("Enter the number between 1 to 7");
//		Scanner sc = new Scanner(System.in);
//		int day = sc.nextInt();
//		switch(day)
//		{
//			case 1:
//			{
//				System.out.println("Monday");
//				break;
//			}
//			case 2:
//			{
//				System.out.println("Tuesday");
//				break;
//			}
//			case 3:
//			{
//				System.out.println("Wednesday");
//				break;
//			}
//			case 4:
//			{
//				System.out.println("Thusday");
//				break;
//			}
//			case 5:
//			{
//				System.out.println("Friday");
//				break;
//			}
//			case 6:
//			{
//				System.out.println("Saturday");
//				break;
//			}
//			default:
//			{
//				System.out.println("It's Holiday Sunday!!");
//			}
//		}
		
		
		// By using enhance switch case
		
//		switch(day)
//		{
//			case 1 -> System.out.println("Monday");
//			case 2 -> System.out.println("Tuesday");
//			case 3 -> System.out.println("Wednesday");
//			case 4 -> System.out.println("Thusday");
//			case 5 -> System.out.println("Friday");
//			case 6 -> System.out.println("Saturday");
//			case 7 -> System.out.println("It's Holiday Sunday!!");
//	
//		}
				
			
		// Problem 5   leap year or not
		
//		System.out.println("Enter the year");
//		Scanner sc2 = new Scanner(System.in);
//		
//		int year = sc2.nextInt();
//		
//		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
//		{
//			System.out.println("It is leap Year");
//		}
//		else
//		{
//			System.out.println("It is not leap Year");
//		}
			
		// Problem 6 type of url .com--- commercial website  .org---- organization .in -------Indian
		 
		// Also do using if else if else
		
		System.out.println("Enter the url last character including .");
		Scanner sc3 = new Scanner(System.in);
		
		 String url = sc3.next();
		 
		switch(url)
		{
		case ".com":
		{
			System.out.println("commercial website");
			break;
		}
		
		case ".org":
		{
			System.out.println("organization website");
			break;
		}
		case ".in":
		{
			System.out.println("Indian website");
			break;
		}
			
		}
		
	}

}
