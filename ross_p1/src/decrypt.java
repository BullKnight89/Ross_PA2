import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ask user for 4 digit integer
		Scanner in = new Scanner(System.in);

		// declare variables to store each individual digit to be encrypted by
		// application
		int decryptNum;
		int userNum1;
		int userNum2;
		int userNum3;
		int userNum4;

		// ask user to enter encrypted number
		System.out.println("Please enter your encrypted number:");
		decryptNum = in.nextInt();

		userNum1 = decryptNum / 1000; // extract 1st digit entered from user
		userNum2 = (decryptNum / 100) % 10; // extract 2nd digit entered from user
		userNum3 = (decryptNum % 100) / 10; // extract 3rd digit entered from user
		userNum4 = decryptNum % 10; // extract 4th digit entered from user

		// Swap first digit with third digit, and swap second digit with fourth
		int temp1 = userNum3; // declare int temp1 to create a temporary spot for value in userNum3 to be held
		userNum3 = userNum1; // change 3rd digit to be the same as userNum1
		userNum1 = temp1; // change 1st digit to be the same as the value held in temp1 which was
							// originally userNum3

		int temp2 = userNum4; // declare int temp2 to create a temporary spot for value in userNum4 to be held
		userNum4 = userNum2; // change 4th digit to be the same as userNum2
		userNum2 = temp2; // change 2nd digit to be the same as the value held in temp2 which was
							// originally userNum4

		// change all your digits back to their original form
		if (userNum1 > 6) {
			userNum1 = Math.abs(userNum1 - 7) % 10; // if the number is greater than 6 it will reverse the encryption
													// method using almost identical formula
		} else {
			userNum1 = (userNum1 + 3) % 10; // else we must change the formula to have the number return to its original
											// state
		}

		if (userNum2 > 6) {
			userNum2 = (userNum2 - 7) % 10;// if the number is greater than 6 it will reverse the encryption method
											// using almost identical formula
		} else {
			userNum2 = (userNum2 + 3) % 10; // else we must change the formula to have the number return to its original
											// state
		}

		if (userNum3 > 6) {
			userNum3 = (userNum3 - 7) % 10;// if the number is greater than 6 it will reverse the encryption method
											// using almost identical formula
		} else {
			userNum3 = (userNum3 + 3) % 10; // else we must change the formula to have the number return to its original
											// state
		}

		if (userNum4 > 6) {
			userNum4 = (userNum4 - 7) % 10;// if the number is greater than 6 it will reverse the encryption method
											// using almost identical formula
		} else {
			userNum4 = (userNum4 + 3) % 10; // else we must change the formula to have the number return to its original
											// state
		}

		System.out.println("Your original number is: " + userNum1 + userNum2 + userNum3 + userNum4); // print out the
																										// user's
																										// original
																										// number

	}

}
