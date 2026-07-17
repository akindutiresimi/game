/*collect number
when it less than 0 stop 
find the largest
the average the total by the counter input
using the do while*/


import java.util.Scanner;
	
	public class Largest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int counter = 1;
	int largest = 0;

	System.out.print("Enter number");
	number = input.nextInt();
		
	while (number >= 0){
	counter++;

	System.out.print("Enter number");
	number = input.nextInt();
	
	System.out.print(+ number);
	}
	}
}