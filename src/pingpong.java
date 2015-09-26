import java.util.Scanner;

//b. Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, and "ping pong" 
//if number is divisible by both, else print the number.

public class pingpong {



	public static void main (String[] args){
		System.out.println("Enter a number:");

		Scanner keyinput=new Scanner(System.in);
		int x = keyinput.nextInt();


		if(x % 3 == 0 && x % 5 == 0){

			System.out.println("ping pong");

		}else if(x % 5 == 0){

			System.out.println("pong");

		}else if(x%3==0 ){

			System.out.println("ping ");
		}else{

			System.out.println(x);
		}

	}

}


