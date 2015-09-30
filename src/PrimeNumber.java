


import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program  to check if a given number is prime or not.
		
		
		System.out.println("Enter a number to check: ");
		
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		int counter=0;
		
		for(int i=1;i<=number;i++){
			
			if(number%i==0){
				counter++;
				
			}
					
		}
		
		if(counter==2){
			
			System.out.println("The number "+ number+ " is prime number. ");
			
		}else{
			System.out.println("The number "+number+ " is not prime number. ");
			
		}
			
	
		
		
	}

}
