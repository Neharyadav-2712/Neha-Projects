package company;
import java.util.Scanner;

// Ques 1) CBSC board percentage 

public class Cwh_06_CbscPercentageExercise {

	public static void main(String[] args) {
		
		System.out.println("Taking input from Uses");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		System.out.println("Enter number 3");
		int c = sc.nextInt();
		System.out.println("Enter number 4");
		int d = sc.nextInt();
		System.out.println("Enter number 5");
		int e = sc.nextInt();
		float sum=(a+b+c+d+e);
		
		float Avg = (sum/500)*100;	
		System.out.println("The percentage of all subject is" + " " + Avg);
	}

}
		
	
