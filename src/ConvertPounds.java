import java.util.Scanner;

/**
 * Homework1 - 2.4: Converts pounds to kilograms
 * 
 * CIS2571-002
 * @author Darryl Karney
 * @version 06Jun2018
 */

public class ConvertPounds {

	public static void main(String[] args) {
		//Initiate variables
		Scanner input = new Scanner(System.in);
		double pounds;
		double kilograms;
		
		//Get user input
		System.out.println("Enter a number in pounds: ");
		pounds = input.nextDouble();
		
		//Convert to kilograms
		kilograms = pounds * 0.454;
		
		//Display output
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
	}

}
