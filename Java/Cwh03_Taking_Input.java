package company;
import java.util.Scanner;

public class Cwh03_Taking_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Taking input from Uses");

Scanner sc =  new Scanner(System.in);


//1) For int
System.out.println("Enter number 1");
int a = sc.nextInt();
System.out.println("Enter number 2");
int b = sc.nextInt();

int sum1 = a + b;


System.out.println("The sum of number is");

System.out.println(sum1);


//2) For float
System.out.println("Enter number 1");
float a1 = sc.nextFloat();
System.out.println("Enter number 2");

float b1 = sc.nextFloat();


float sum2 = a1 + b1;
System.out.println("The sum of number is");

System.out.println(sum2);



	}

}
