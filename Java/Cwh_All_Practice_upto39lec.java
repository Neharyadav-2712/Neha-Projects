package company;
import java.util.*;

public class Cwh_All_Practice_upto39lec {

	private static char[] sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1) percentage
		
//	float marks;
//	
//	System.out.println("Taking input from user");
//	Scanner Sc = new Scanner(System.in);
//
//		System.out.println("Enter the marks of sub1");
//		int a = Sc.nextInt();
//		System.out.println("Enter the marks of sub2");
//		int b = Sc.nextInt();
//		System.out.println("Enter the marks of sub3");
//		int c = Sc.nextInt();
//		System.out.println("Enter the marks of sub4");
//		int d = Sc.nextInt();
//		System.out.println("Enter the marks of sub5");
//		int e = Sc.nextInt();
//		
//		float sum=a+b+c+d+e;
//		
//		marks = sum/500*100;
				
		
//		System.out.println("The percentage of all the student is " + marks);
		
		// 2) sum 3 no. by user input
		
//		System.out.println("Taking 3 numbers from users");
//		Scanner Sc = new Scanner(System.in);
//		System.out.println("Enter no. 1");
//		int a = Sc.nextInt();
//		System.out.println("Enter no. 2");
//		int b = Sc.nextInt();
//		System.out.println("Enter no. 3");
//		int c = Sc.nextInt();
//	
//		int Sum = a+b+c;
//		System.out.println("Sum of 3 nos. is " + Sum);
		
		
		// 3) CGPA of 3 sub
		
//	float	Subject1 =45;
//	float	Subject2 =95;
//	float	Subject3 =48;
//	float cgpa = (Subject1 + Subject2 +Subject3)/30;
//	System.out.println(cgpa);

	// 4) asks user to enter their name and print"Hello <name>, have a good day".
	
//	Scanner Sc = new Scanner(System.in);
//	System.out.println("Enter your Name");
//	String str = Sc.next();
//	//String str = Sc.nextLine(); // including spaces also eg. sfsdfs sfdsfds sfsdfs
//	System.out.println("Hello " + str + " have a good day");
	
	
	// 5) convet km to miles ( 1 km means 0.621371 mile)
	

//	System.out.println("Enter any number");
//	Scanner Sc = new Scanner(System.in);
//	float a = Sc.nextFloat();
//	
//	float miles = a *0.621f;
////System.out.println(a*0.621);
//	System.out.println(miles);
	
//	6) to detect no is int or not
//System.out.println("Enter any number");
//Scanner sc = new Scanner(System.in);
//	System.out.println(sc.hasNextInt());


// Ch set 2.1) result of following expression.
	
//	float a =7/4.0f*9/2.0f;
//	System.out.println(a);
	
	
//	1)write a java program to encrypt a geade by adding 8 to it and then decrypt to show correct grade.
	
//    char grade = 'B';
//    grade+=8;
//    System.out.println(grade);
//    
////    decrypt
//    
//    grade-=8;
//    System.out.println(grade);
	
	
// 2) use comparison operator given no. is greater than user enter no or not.
	
	
//	System.out.println("Enter a number");
//	Scanner Sc = new Scanner(System.in);
//	int a =Sc.nextInt();
//System.out.println(a>8);


//3) write a following expression.

//float v=7.0f;
//float u = 2.0f;
//float a=5.0f;
//float s =1.0f;
//
//float b= ((v*v-u*u)/(2*a*s));
//System.out.println(b);

// 4) find the value?


//int x=7;
//int a= 7* 49/7+35/7;
//System.out.println(a);
		
// Practice set3 1) string to lowercase
		
//		String name = "NEHA";
//		name=name.toLowerCase();
//		System.out.println(name);

//2) replce spaces with "-".
		
		
//	String s1 = "vedu dss fssdfs";
//	s1 = s1.replace(" ","_");
//	System.out.println(s1);
		
	
//3)write a java program to fill the letter template
	
//	String letter = "Dear <!name>, Thanks a lot!";
//	letter=letter.replace("<!name>", "Neha");
//	System.out.println(letter);
	
// 4) to detect double and triple spaces in the string.
	
//	String name2 = "This contain  double & triple spaces";
//	System.out.println(name2.indexOf("  "));
//		System.out.println(name2.indexOf("   "));

//5) Format using escape sequence.
		
//	String letter2 = "Dear Harry,\n\t This Java Course is nice.\nThanks";
//	System.out.println(letter2);


//chapter 4 practice set
	
// 1) what will be the output?
		
//	int a =10;
//	if(a==11)
//	{
//		System.out.println("I am 11");
//	}
//	else
//	{
//		System.out.println("I am not 11");
//	}
		
// 2) 
	
//	System.out.println("Enter the Marks of 3 Subject");
//	
//	Scanner Sc = new Scanner(System.in);
//	System.out.println("Enter the Marks of Maths");
//    float Maths = Sc.nextInt();
//    System.out.println("Enter the Marks of Bio");
//    float Bio = Sc.nextInt();
//    System.out.println("Enter the Marks of physics");
//    float physics = Sc.nextInt();
//    
//    float f = (Maths + Bio+ physics)/3.0f;
//    
//    if(f >= 40 && Maths>= 33 && Bio>= 33 && physics>=33)
//    {
//    	System.out.println("The Student is passed");
//    }
//    else
//    {
//    	System.out.println("The Student is not passed");
//    }
    
    
	// 3) Income tax
    
//	Scanner Sc = new Scanner(System.in);
//System.out.println("Enter your Income");
//		float tax = 0;
//		float income=Sc.nextFloat();
//	if(income<2.5)
//	{
//		tax+=0;
//	}
//	else if (income > 2.5f && income <=5.0f)
//	{ 
//	tax = tax + 0.05f * (income-2.5f);
//	}
//	else if (income > 5f && income <=10.0f)
//	{ 
//		tax=tax+0.05f * (5.0f-2.5f);
//		tax =tax+ 0.2f * (income-5f);
//	}
//	else if(income >10.0f)
//	{
//		tax=tax+0.05f * (5.0f-2.5f);
//		tax =tax+ 0.2f * (10.0f-5f);
//		tax =tax+ 0.2f * (income-10.05f);
//	}
//    System.out.println(tax);
    

	// 4) Day in s week
    
//    int Day =6;
//    switch(Day)
//    {
//    case 1:
//    	System.out.println("Monday");
//    	break;
//    case 2:
//    	System.out.println("Thusday");
//    	break;
//    case 3:
//    	System.out.println("Wednesday");
//    	break;
//    case 4:
//    	System.out.println("Thusday");
//    	break;
//    case 5:
//    	System.out.println("Saturday");
//    	break;
//    case 6:
//    	System.out.println("Sunday");
//    	break;
//    }
		
// palindrome
		
//	System.out.println("Enter a String");
//	Scanner sc = new Scanner(System.in);
//	String src = sc.next();
//	String s1 = "";
//	
//	for(int i=src.length()-1; i>=0; i--)
//	{
//		char ch = src.charAt(i);
//		s1=s1+ch;
//	}
//	if(src.equals(s1))
//	{
//		System.out.println("It is a palindrome");
//	}
//	else
//	{
//		System.out.println("It is not  a palindrome");
//	}
	
	// 5) leap year or not
		
//	System.out.println("Enter the year which you want");
//	
//	Scanner sc = new Scanner(System.in);
//    int year = sc.nextInt();
//    if(year % 400 == 0  || year % 4 ==0)
//    {
//    	System.out.println("It's a leap year");
//    }
//    else
//    {
//    	System.out.println("It's not a leap year");
//    }
    
 // 6) find out the type of website.
    
//    Scanner Sc = new Scanner(System.in);
//    System.out.println("Enter the type of URL like .com , .org , .in");
//    String s1 = Sc.next();
//    if(s1.endsWith(".com"))
//    {
//    	System.out.println("Commercial website");
//    }
//    else if(s1.endsWith(".org"))
//    {
//    	System.out.println("Organization website");
//    }
//    else if(s1.endsWith(".in"))
//    {
//    	System.out.println("Indian website");
//    }
//    else
//    {
//    	System.out.println("Other website");
//    }
    
 // Java Exercise 2:- Rock , paper,scissors game
    
// System.out.println("Enter the number 0 for Rock , 1 for paper , 2 for scissors");   
// Scanner scr = new Scanner(System.in);
// int userInput =scr.nextInt();
// 
// Random ran1 = new Random();
// int computerInput = ran1.nextInt(3);
//    
// if(userInput == computerInput)  
// {
//	 System.out.println("It's a Draw");
// }
// else if(userInput == 0 && computerInput ==  2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1)
// {
//	 System.out.println("You are Win");
// }
// else
// {
//	 System.out.println("Computer is Win");
// }
// 
// System.out.println("Computer Choice:" + computerInput);
//
// if(computerInput == 0)
// {
//	 System.out.println("Computer Choice - Rock");
// }
// else if(computerInput == 1)
// {
//	 System.out.println("Computer Choice - Paper");
// }
// else
// {
//	 System.out.println("Computer Choice - Scissor");
// }
 
 
// Practice set 5
		
// 1) print following pattern
		
//	int n = 5;
//	for(int i=n ; i>0; i--)
//	{
//		for(int j=0; j<i; j++)
//		{
//			System.out.print("*");
//		}
//		System.out.println("\n");
//	}
		
		
	// 2) sum 1s even number using while loop	
	
//	int sum=0;
//	int n=4;
//	int i=0;
//	while(i<n)
//	{
//		sum+=2*i;
//		i++;
//	}
//	System.out.println(sum);
	
	// 3) Multiplication Table
	
//	int n=5;
//	for(int i=1; i<=10;i++)
//	{
//		System.out.printf("%d *%d= %d\n", n,i, n*i);
//	}
		
	
	// 4) Multiplication Table of 10 in reverse order
	
//	int n= 10;
//	for(int i=10 ; i>=1 ; i--)
//	{
//		System.out.printf("%d *%d= %d\n", n,i, n*i);
//	}
	
	//5) factorial of a number using for loop.
//	int n=5;
//int factorial= 1;
//for(int i=1; i<=n; i++)
//{
//	factorial*=i;
//}
//	System.out.println(factorial);
	
	//6) factorial of a number using while loop.
		
//	int n=5;
//	int i = 1;
//	int factorial= 1;
//		while(i<=n)
//		{
//			factorial*=i;
//			i++;
//		}
//		System.out.println(factorial);
		
		
// 7) Repeat 1 using while loop		
		
//	int n=5;
//	int i = n;
//		while(i>=1)
//		{
//			int j=1;
//			while(j<=i)
//			{
//				System.out.print("*");
//				j++;
//			}
//
//			System.out.print("\n");
//			i--;
//
//		}
		
// 8) true
		
// 9) Sum of number of multiplication table of 8.		
		
		
//		int n=8;
//		int sum = 0;
//		for(int i=1; i<=10; i++)
//		{
//			
//			sum+=i*n;
//		}
//		
//System.out.println(sum);

// 10) At least once


// 11)  sum of even number using for loop


//int n=3;
//int sum = 0;
//for(int i=0;i<n;i++)
//{
//	sum+=i*2;
//}
//System.out.println(sum);
		
		
// Practice set 6

// 1) sum of element of array
		
//	float [] marks = {33.33f, 3.5f, 8.5f, 9.7f,35.6f};
//	float sum =0;
//	for(float element:marks)
//	{
//		sum+=element;
//	}
//	System.out.println(sum);	
		
// 2) integer is present in array or not		
		
//		float [] marks = {33.33f, 3.5f, 8.5f, 9.7f,35.6f};
//		float num =13.5f;
//		boolean isInArray = false;
//		for(float element:marks)
//		{
//			if(num == element)
//			{
//				isInArray = true;
//				break;
//			}
//		}
//		if(isInArray)
//		{
//			System.out.println("Number is prsent in array");
//		}
//		else
//		{
//			System.out.println("Number is not prsent in array");
//		}
	
		
// 3) average marks i physics using for each loop
		
//		int [] marks = {88,93,86,64,90};
//		int sum = 0;
//		for(int element:marks)
//		{
//			sum+=element;
//		}
//		System.out.println(sum/marks.length);
		
// 4) Adding two matrices of size 2*3.
		
		
//	int [][] mat1= {{1,4,5},
//	               {5,7,8}};
//	
//	int [][] mat2= {{6,7,8},
//			        {9,2,4}};
//	
//	int [][] result= {{0,0,0},
//	                 {0,0,0}};
//	for(int i=0; i<mat1.length; i++)
//	{
//		for(int j=0; j<mat1[i].length; j++)
//		{
//			
//			result[i][j] = mat1[i][j] + mat2[i][j];
//			System.out.print(result[i][j] + " ");
//		}
//		
//		System.out.println("");
//	}
	
	
	// 5) reverse the array
	
//	int [] name = {33,77,88,33,99};
//	{
//		for(int i= name.length-1; i>=0; i--)
//		{
//			System.out.print(name[i] + " " );
//		}
//	}
	
// 6) find maximum of array
	
//		int [] arr = {34,56,90,22,98};
//		//int max=0;
//		int max=Integer.MIN_VALUE;
//		for(int e:arr)
//		{
//			if(e>max)
//			{
//				max=e;
//			}
//			
//		}
//		System.out.println("The maximum element is " + max);
	
		
// 7) Fins minimum value in array
		
		int [] arr1 = {4,4,5,7,2,1};
		int min=Integer.MAX_VALUE;
		System.out.println(min);
		for(int e:arr1)
		{
			if(e<min)
			{
				min=e;
			}
		}
			System.out.println("The minumum value is " + min);
		
		
		
// 8) array is sorted or not
		
//		boolean isSorted= true;
//		
//		int [] arr1 = {1,2,3,4};
//		for(int i=0; i<arr1.length-1; i++)
//		{
//			if(arr1[i] > arr1[i+1])
//			{
//				isSorted=false;
//				break;
//			}
//		}
//		if(isSorted)
//		{
//			System.out.println("Array is sorted");
//		}
//		
//		else 
//		{
//			System.out.println("Array is not sorted");
//		}
		
	}
	
 	}


