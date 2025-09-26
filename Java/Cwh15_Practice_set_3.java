package company;

public class Cwh_15_ps3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1) write a java program convert a string to lowercase.

//		String name = "NEHA";
//		name = name.toLowerCase();
//		System.out.println(name);
		
		
// 2) Write a java program to replace spaces with underscore.
		
		
//		String name1 = "Neha sdfdfgdf dgdfgdf dfgdfg";
//		name1 = name1.replace(" ", "_");
//		System.out.println(name1);
		
		
//3) Write a java program to fill in a letter templte which both like below.
		
		String letter = "Dear <|name|>,Thanks a lot!";
		letter = letter.replace("<|name|>", "Neha");
		System.out.println(letter);
		
		
		
//4) Write a java program to detect double and triple spaces in a string.
		
		String myString = "This string contains  double and   triple spaces.";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		 
//5) Write	a program to format the following letter using escape sequence character.
		
		String myletter = "Dear Harry,\n\tThis Java Course is nice.\n\tThanks!";
		System.out.println(myletter);
		
//6) Write
		
		
		
		
		
		
	}

}
