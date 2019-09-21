import java.util.Scanner;

public class ross_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		// declare variables for BMI in both pounds and kilograms
		double bmiPounds;
		double bmiKilos;

		// ask user which formula they would like to use to calculate BMI
		System.out.println("If you would like to calculate your BMI using pounds (weight) and inches (height), enter 1.");
		System.out.println("If you would like to calculate your BMI using kilograms (weight) and meters (height), enter 2.");

		int choice = in.nextInt();

		//if user picks an invalid choice tell the user they have done so
		if ((choice != 1) && (choice != 2)) {
			System.out.println("You entered an incorrect number. Please restart the program and enter either 1 or 2");
			return;
		}

		System.out.println("Please enter your weight:\n");	// prompt user to input their weight
		int weight = in.nextInt();

		System.out.println("Please enter your height:\n"); //prompt user for input of height
		int height = in.nextInt();

		// calculate BMI based on the user's choice and output results
		if (choice == 1) {
			bmiPounds = (double) (703 * weight) / (height * height); // bmi calculation for pounds and inches
			System.out.printf("Your BMI is %.2f\n\n", bmiPounds); 
		} else {
			bmiKilos = (double) (weight) / (height * height); // bmi calculation for kilograms and meters
			System.out.printf("Your BMI is %.2f\n\n", bmiKilos);

		}
		// display BMI categories and values from National Heart Lung and Blood site
		System.out.println("To evaluate your results, please use the information below.\n");
		System.out.println("BMI Categories:");
		System.out.println("Underweight \t= <18.5");
		System.out.println("Normal weight \t= 18.5–24.9");
		System.out.println("Overweight \t= 25–29.9");
		System.out.println("Obesity \t= BMI of 30 or greater");

	}

}
