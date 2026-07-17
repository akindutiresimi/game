/*import scanner 
collect the number from the user 
using the while loop
the user input decrease from that point to 1
using the user number as counter 
counter adddition is - -
prnt out*/ 


import java.util.Scanner;

	public class Simulate{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	int counter = 0;
	int number = 0;
	
	System.out.print("enter number");
	number = input.nextInt();

	for(counter = number; counter >= 1; counter --){

	System.out.println(+ counter);
	}
	}
}

	
