import java.util.Scanner;

//c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".

public class StringConverts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter your String: " );
		Scanner sc = new Scanner(System.in);
		String input  = sc.nextLine();
		
			
		System.out.println("Result : " + convertStrings(input));	
		
	}
			
	public static String convertStrings(String st)
	{	
		String s  = "";
		String[] stringarray = st.split(" ");
		int counter = 1;
		
	    if(st.isEmpty() || st.equals(" "))
	    {
	    
	    	s = "result is empty";
	    	
	    }
	    
	    else
	    {
	    	
		for(int i = 0; i < stringarray.length; i++)
		{
			s = s + stringarray[i] + counter + " ";
			counter++;
        		
		}	
		
			
	    }
	    return s;
			
	}
		
		
		
		
	}


