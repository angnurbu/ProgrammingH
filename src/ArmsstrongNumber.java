


/* Write a program  to check an armstrong number i.e. whether the if we power up the each individual
number to the total number of digits in the number and add them it should be equal to the number itself. For example
153 has 3 digits in it and if we do 1^3+5^3+3^3=153.**/




import java.util.Scanner;

public class ArmsstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number to check: ");
		Scanner z = new Scanner(System.in);
		int x = z.nextInt();
				
		int counter = 0, temp = x, lastnum = 0, babu = x;
		double sum = 0; // made double to do the math.power

		while(temp > 0) // this loop is just for counting the number of digits
		{   
			temp = temp / 10;         
			counter = counter + 1;
		} 
		
		while (x > 0 ) // this loop is for getting the sum of the power of the digits
		{
			 lastnum = x % 10;
			sum = sum + Math.pow(lastnum, counter);
			x = x / 10;
		}

		if(sum == babu) 
			System.out.println(babu + " is Armstrong Number");
		else
		System.out.println(babu + " is not Armstrong Number");
		
		}




	}


