/*import Scanner
ask the user to enter a number
using a loop find the nth
using exponitial of number input 
using for do while*/ 

import java.util.Scanner;

	public class DisplayOfN{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int number = 0;
	
	System.out.print("enter number");
	number = input.nextInt();

	for(counter = 1; counter <= number; counter+=2){
	
	System.out.println("the number is:"+ number);
	}
	System.out.println();
	}
}