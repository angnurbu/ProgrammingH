

/* Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
     		   --> One Function should swap the numbers without any third new variable.
      		   --> Second function should swap the numbers using a third variable. 
*/

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chair1 = 1, chair2 = 2, chair3 = 0;
		
		chair3 = chair1; // copy chair1 to chair3

		chair1 = chair2; // copy chair2 to chair 1

		chair2 = chair3;  // copy chair 3 to chair 2
		     
		
		System.out.println(chair1);
		System.out.println(chair2);		
		
		
		chair1 = 23;
		chair2 = 63;
		
		chair1 = chair1 + chair2;
		
		
		
		chair2 = chair1 - chair2;
		chair1 = chair1 - chair2;
		
		
		System.out.println(chair2);
		System.out.println(chair1);
				
		
	}

}
