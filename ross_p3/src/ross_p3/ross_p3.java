package ross_p3;

import java.util.Scanner;
import java.util.*;

public class ross_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		// first create topics to rate and store them in 1D array

		String topicsArry[] = new String [5]; // declare array of topics to rate
		topicsArry[0] = "Politics";
		topicsArry[1] = "Religion";
		topicsArry[2] = "Climate";
		topicsArry[3] = "Finance";
		topicsArry[4] = "Tacos";
		
		int responArry[][] = new int[5][10]; // declare an array to store user responses
		int pointsArry[] = new int[5]; // declare an array to store the total points for each topic from all the
										// surveys
		int surveys = 0; // declare variable to count the number of users who took survey to calculate
							// avg scores
		int topicRating = 0; // declare variable for rating each topic
		int trueColumn = 0; // declare variable to put rating under true
		int totalPoints = 0; // total points from all ratings for a topic
		char newSurvey = 0; // declare and set variable to determine whether or not survey continues to show
		int i, j; // declare counter variable to count topics

		// create loop to continue running survey if a new user wants to take the survey
		while (newSurvey != 'n') { 

			surveys++; // counter for the total number of surveys

			// prompt user to rate the 5 topics on a scale of 1 to 10
			System.out.println("Please rank the following topics from 1-10 based on how important they are to you.\n"
					+ "1 is very low importance and 10 is high importance.");
			System.out.println("");

			for (i = 0; i < topicsArry.length; i++) { 

				System.out.println("Please rate " + topicsArry[i] + ":"); // prompt user to input rating for specific
																			// topic
				topicRating = in.nextInt(); // have user input their rating
				trueColumn = topicRating - 1; // variable will change user's input rating by minus 1 to be stored in
												// appropriate index location. 

				if (topicRating > 0) { // confirm user entered correct rating
					responArry[i][trueColumn]++; // ratings are stored and counted
				} 
				else { // if rating is invalid, let them know and have them start over
					System.out.println("You've entered an incorrect number.");
					System.out.println("Please start the survey over using the rating scale of 1 - 10.\n");
				}
			}

			System.out.println("Would you like to start a new survey? "); // ask if user would like to start a new
																			// survey
			System.out.println("Enter 'n' to stop and any other key to open a new survey.");
			newSurvey = in.next().charAt(0); // get input from user whether or not to continue

		}

		// if no, then proceed to display topics and their results
		// create your top row in your frequency distribution table
		System.out.printf("%-10s%4s%4s%4s%4s%4s%4s%4s%4s%4s%4s%6s\n", "Topics", "1", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "Avg."); 
		
		// create a line underneath the headings
		System.out.printf("%-10s%4s%4s%4s%4s%4s%4s%4s%4s%4s%4s%6s\n", "------", "-", "-", "-", "-", "-", "-", "-", "-",
				"-", "--", "----"); 
		 
		for (i = 0; i < topicsArry.length; i++) {

			System.out.printf("%-10s", topicsArry[i]); // print all the topics in the array

			for (j = 0; j <= 9; j++) { // set for loop to cycle through 10 ratings for each topic
				System.out.printf("%4s", responArry[i][j]); // print each rating under the corresponding index in the array
				totalPoints = totalPoints + ((j+1) * responArry[i][j]); // calculate the total points for each rating

			}
			double average = (double) totalPoints / surveys; // get the average rating of each topic and then print them
			System.out.printf("  %.2f\n", average); 
			
			pointsArry[i] = totalPoints; // create a new array to store all of the points totaled from each topic
			average = 0; // reset the average points to zero for the next topic
			totalPoints = 0; // reset the total points to zero for the next topic

		}
		
		int lowRating = pointsArry[0], topRating = pointsArry[0]; // set variable lowRating and highRating to first index in array
		int worst = 0, best = 0; // declare variables that will be used to represent index numbers in arrays

		//start for loop to go through the total points of each topic to get lowest and top ratings
		for (i = 0; i < pointsArry.length; i++) {

			if (pointsArry[i] < lowRating) {
				lowRating = pointsArry[i]; //set variable to the point value stored in index
				worst = i; //sets variable to index position to reference later for index of lowest rating
			}
			if (pointsArry[i] > topRating) {
				topRating = pointsArry[i]; //set variable to the point value stored in index
				best = i; //sets variable to index position to reference later for index of lowest rating
			}
		}
		//print out lowest and top ratings
		System.out.println("");
		System.out.println(topicsArry[best] + " received the best rating with " + topRating + " points.");
		System.out.println(topicsArry[worst] + " received the lowest rating with " + lowRating + " points.");

	}
}