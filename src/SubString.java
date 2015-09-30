// Write a program to find a substring in a given string and then replace it with another string.



public class SubString {
	public static void main(String[] args) {

		String a = " hamro nepal";
		String b = "a";
		String c = "t";
//		String d = findAlternateSubString(a, b, c);

		System.out.println(a.substring(0));
		int x = 2;
		
		String change = String.valueOf(x);
		System.out.println(change);
		
	}
}
/*		
//		System.out.println(d);
}


	public static String findSubString(String pOriginalString, String pFindString, String pReplaceString){
		
		return pOriginalString.replace(pFindString,  pReplaceString);
		
	}

	public static String findAlternateSubString(String pOriginalString, String pFindString, String pReplaceString){
		
		int index = pOriginalString.indexOf(pFindString);
		System.out.println(index);
		String beforeWord =  pOriginalString.substring(0,index);
		System.out.println(beforeWord);
		String afterWord = pOriginalString.substring(index+pFindString.length());		
	    System.out.println(afterWord);
		return beforeWord + pReplaceString + afterWord;
		
	}

    
}
		
	
		
		
		
		
		
		
		
		
		
*/