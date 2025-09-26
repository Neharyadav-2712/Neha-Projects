package company;
import java.util.*;


public class Cwh18_elseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  If_else_if_else
		
	/*	int age;
		
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	
		if(age > 56)
		{
			System.out.println("You are experinced");
		}
		
		else if(age > 46)
		{
			System.out.println("You are semi-experinced");
		}

		else if(age > 36)
		{
			System.out.println("You are semi-semi-experinced");
		}
		else {
			System.out.println(" You are not experinced");*/
//		}
//}
// Switch case
		
	int age;
		
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		switch(age)
		{
		case 18:
			System.out.println("You are going to become an adult!");
			break;
			
			
		case 23:
			System.out.println("You are going to join the job!");
			break;
			
			
		case 60:
			System.out.println("You are going to get retired!");
				break;
			
			default:
				System.out.println("Enjoy your life!");
		}
		
		System.out.println("Thanks for using my Java Code");

}
}
