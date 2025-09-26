package company1;

public class Cwh14_StringsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// Methods of String
		
//  1) name.length();
		
	String name = "Chinni";
	
	//int value = name.length();
	//System.out.println(value);
	
//  2) name.toLowerCase();
	
	String lstring = name.toLowerCase();
	System.out.println(lstring);
	
//  3) name.toUpperCase();
	
	String ustring = name.toUpperCase();
	System.out.println(ustring);
	
//  4) name.trim();
	
	String nontrim = "     Neha Yadav     ";
	System.out.println(nontrim);
	
	String trim = nontrim.trim();
	System.out.println(trim);
	
//  5) name.subString(start index);
	
	System.out.println(name.substring(2));
	
//  6) name.subString(start index, end index); // start index is included and end index is excluded.
	
	System.out.println(name.substring(2,4));
	
//  7) name.replace();
	
	System.out.println(name.replace('n', 'r')); // Both are char
	
	System.out.println(name.replace("hin", "abc")); // Both are strings
	
	System.out.println(name.replace("i", "abc"));
		
//  8) name.startsWith();
	
	System.out.println(name.startsWith("Chi")); // true
	
	System.out.println(name.startsWith("phi")); // false
	
//  9) name.endsWith();
	
	System.out.println(name.endsWith("nni")); // true
	
	System.out.println(name.endsWith("hin")); // false
	
//  10) name.charAt();
	
	System.out.println(name.charAt(0));
	System.out.println(name.charAt(2));
	
//  11) name.indexOf();
	
	System.out.println(name.indexOf("nn"));
	
	
//  12) name.indexOf(); // we also give starting character
	
	 String modifiedName = "Harryrry33";
			 
	System.out.println(modifiedName.indexOf("rry"));
	
	System.out.println(modifiedName.indexOf("sdf",2));  // If match not found
	
//  13)  name.lastIndexOf();
	
	System.out.println(modifiedName.lastIndexOf("rry"));
	
	System.out.println(modifiedName.lastIndexOf("rry",4)); // search from last
	
//  12) name.equals("");
	
	System.out.println(name.equals("Chinni"));
	
	System.out.println(name.equals("chinni"));
	
//  12) name.equalsIgnoreCase();
	
	System.out.println(name.equalsIgnoreCase("chinni"));
	
	System.out.println(name.equalsIgnoreCase("Chinni"));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}


}
