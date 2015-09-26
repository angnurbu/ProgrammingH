
import java.util.Scanner;

public class fibionacci {

	public static void main(String args[]) {

		System.out.println("Enter the nth number of fibionacci numbers you want:");

		Scanner keyinput = new Scanner(System.in);
		int numbers = keyinput.nextInt();

		int first = 0;
		int second = 1;
		int next;

		if (numbers == 1) {

			System.out.print(second);
		} else if (numbers == 2) {
			System.out.print(first + "," + second);
		} else {
		}

		if (numbers >= 3)
			System.out.print("0,1");

		for (int i = 3; i <= numbers; i++) {

			next = first + second;
			System.out.print("," + next);

			first = second;
			second = next;

		}

	}

}

/*
 * public class fibionacci {
 * 
 * @SuppressWarnings("resource") public static void main(String args[]) {
 * 
 * //input to print Fibonacci series upto how many numbers System.out.print(
 * "Enter number upto which Fibonacci series to print: "); int number = new
 * Scanner(System.in).nextInt();
 * 
 * System.out.println("Fibonacci series upto " + number + " numbers : ");
 * //printing Fibonacci series upto number for(int i=1; i<=number; i++){
 * System.out.print(ang(i) +" "); } }
 * 
 * // Java program for Fibonacci number using recursion. public static int
 * ang(int number){ if(number == 1 || number == 2){ return 1; }
 * 
 * return ang(number-1) + ang(number -2); //tail recursion } }
 **/
