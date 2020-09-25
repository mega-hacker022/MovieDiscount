/* Programmer: Meghan Da Silva
 * Date: 9/25/2020
 * Purpose: to see if the customer can have a discount on their movie ticket 
 */

import java.util.Scanner;

public class MovieDiscount {
    public static void main (String [] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        // Ask the user for their age
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        System.err.print("Do you have a coupon? [true/false] ");
        boolean coupon = input.nextBoolean();

        // Print the cost of a movie ticket
        if (age <= 13 || age >= 65) {
        	if (coupon == true) {
        		System.out.println("Your ticket costs $9.50");
        	}
        	else {
        	 System.out.println("Your ticket costs $11.50");
        	}
        }
        
        if ((age > 13 && age < 65)&& coupon == true) {	
        	System.out.println("Your ticket costs $12.50");
        }
        	
        if (coupon == false) {
        	System.out.print("Your ticket costs $14.50");
        }
    }
}
