// Write a program to find a substring in a given string and then replace it with another string.

package primenumber;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {

		System.out.println("Enter the string: ");
		Scanner s1 = new Scanner(System.in);
		String str1 = s1.nextLine();   
		
		 
		System.out.println("Enter the string to be replaced: ");
		Scanner s2 = new Scanner(System.in);
		String stringToReplace = s2.nextLine();
	
		
		System.out.println("Enter the Replacement string : ");
		Scanner s3 = new Scanner(System.in);
		String replaceString = s3.nextLine();   
		
		
		System.out.println(replaceStringwithnewone(str1, stringToReplace, replaceString));
		
		
	}
	
	public static String replaceStringwithnewone(String aString1, String aString2, String aString3){
		
		
		int indexOfStates = aString1.indexOf(aString2);
		 
		 int lengthOfString = aString2.length();
		 String beforeString = aString1.substring(0, indexOfStates);
		 
		 String middleString = beforeString + aString3; 
		 int totalLength = aString1.length();
		 
		 int indexOfBeginningOfEndString = indexOfStates + lengthOfString;
		 String endPart = aString1.substring(indexOfBeginningOfEndString, totalLength);
		 
		 String finalString = middleString + endPart;
		 
		 return finalString;
	
	}		 
		 
		 
		
		
		
}		
		
		
		
	
		
	