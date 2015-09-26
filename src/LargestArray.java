
//  a. Write a program to find the largest number in a given array without using any inbuilt functions. 

public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		int[] a = {1,-45 ,3, 4567,59,65,-9304, 234523524, 2, 1050};
	    
		int max = a[0];
		
		for(int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
				
			max = a[i];
					
		}	
		System.out.println("The largest number is : " + max);	
}
				
}		
			
	
		
		
	


