import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ask user for 4 digit integer
		Scanner in = new Scanner(System.in); 
		
		//declare variables to store each individual digit to be encrypted by application
		int encryptNum;
		int userNum1; 
		int userNum2; 
		int userNum3; 
		int userNum4;
		
		//prompt user to enter a 4 digit number
		System.out.println("Please enter a four digit number:"); 
		encryptNum = in.nextInt();
		
		userNum1 = encryptNum / 1000; 			//extract 1st digit entered from user
		userNum2 = (encryptNum / 100) % 10;		//extract 2nd digit entered from user
		userNum3 = (encryptNum % 100) / 10;		//extract 3rd digit entered from user
		userNum4 = encryptNum % 10;				//extract 4th digit entered from user
		
		//1)replace each digit by adding 7 to the digit, then get remainder of new # divided by 10
		userNum1 = (userNum1 + 7) % 10;			
		userNum2 = (userNum2 + 7) % 10;			
		userNum3 = (userNum3 + 7) % 10;			
		userNum4 = (userNum4 + 7) % 10;
		
		//2)Swap first digit with third digit, and swap second digit with fourth
		int temp1 = userNum3; 			//declare int temp1 to create a temporary spot for value in userNum3 to be held
		userNum3 = userNum1;			//change 3rd digit to be the same as userNum1
		userNum1 = temp1;				//change 1st digit to be the same as the value held in temp1 which was originally userNum3
		
		int temp2 = userNum4;			//declare int temp2 to create a temporary spot for value in userNum4 to be held
		userNum4 = userNum2;			//change 4th digit to be the same as userNum2
		userNum2 = temp2;				//change 2nd digit to be the same as the value held in temp2 which was originally userNum4
		

		//concatenate userNum1-userNum4 to create one number
		int concatNum = Integer.parseInt("" + userNum1 + userNum2 + userNum3 + userNum4); 
		
		//3)Print out the new encrypted integer 
		System.out.printf("The encrypted integer is %04d", concatNum);

	}

}
