/*import scanner
using he scanner to collect input 
using the number collected to loop
when the number is greater than 0 
keep it ruuning 
when it less than 0 stop 
add the total 
the average the total by the counter input
using the do while*/


import java.util.Scanner;
	
	public class Negative{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int counter = 1;
	double total = 0;

	System.out.print("Enter number");
	number = input.nextInt();
		
	while (number > 0){
	counter++;

	System.out.print("Enter number");
	number = input.nextInt();
	
	System.out.print(+ number);
	}
	total = total + number; 
	System.out.print(+ total);

	double average = total / number;
	System.out.print("average:" + average);

	}
}