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
        // Check if they are a child or a senior
        if (age <= 13 || age >= 65) {
        	// Check if they have a coupon too
        	if (coupon == true) {
        		System.out.println("Your ticket costs $9.5.");
        	}
        	// If they don't have a coupon then print their cost
        	else {
        	 System.out.println("Your ticket costs $11.5.");
        	}
        }
        
        // Check if they are between 13 and 65, and if they have a coupon too
        else if ((age > 13 && age < 65)&& coupon == true) {	
        	System.out.println("Your ticket costs $12.5.");
        }
        
        // If they don't have a coupon then they get no discounts
        else if ((age > 13) && (age < 65)&& coupon == false) {
        	System.out.print("Your ticket costs $14.5.");
        }
    }
}
