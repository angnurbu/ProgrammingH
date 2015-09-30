// Write a program to find the common number in any given two arrays.



public class Commonnumber {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6};
		int[] b = {1,2,11,35,6,98,7,9,10};
	

		for(int n = 0; n < a.length; n++)
			for(int i = 0; i < b.length; i++)
			{
				if( b[i] == a[n])
				
					System.out.println(b[i]);			
					
				
		    }
		}
		
	}
	

	
