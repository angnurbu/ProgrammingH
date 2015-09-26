// Write a program to reverse a string. Do not use StringBuffer/StringBuilder inbuilt reverse function.

package primenumber;

public class ReverseString {

	public static void main(String[] args) {
			
	String b = "Boudha";
	  
		System.out.println(reverseString(b));
	}
	
	public static String reverseString(String str ) {
		String eyt = "";
		
		for(int i = str.length()-1; i >= 0; i--)
		{
			eyt = eyt + str.charAt(i);
		}
		
		return eyt;
	}
	
	
	
	
	
}	











				
	
	
