
// Write a program to find the missing number in a series of sorted numbers stored in an array.



public class MissingNum {            
	
	public static void main(String[] args) {
	
	int[] a = {2,4,8,9,10};
	
		
	for(int i = 1; i <= a.length; i++)
		
	{
	
		int b = a[0]; 		
		
		if(a[i] > b && i < a.length)
		{
//    	 missingnum = a[i + 1]
			System.out.println("the Missing number is " + b); 
		} 
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**	

	int sum = 0;
    for(int i=0; i<=7; i++)
    {
        sum = sum + a[i];
       
    }
        
        int n = a[0];     // n is the largest number in the array  
    for(int i = 0; i <= 7; i++)
    {
    	if(a[i] > n )
    	{
    		n = a[i];
       		
    	}
    	    				
    }
           
    System.out.println((n/2)*(n+1) - sum);
    */
	}	
	
}
    
	
	
	
	
	
	
	


