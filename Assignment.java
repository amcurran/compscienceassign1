import java.util.Random; 												//added for q1
import java.util.Scanner;												//added for q2 & q3
import java.text.DecimalFormat;
import javax.swing.JOptionPane;											//added for q4
import java.util.*;

public class Assignment {

	
/*	Tips for Christian: (you can delete these tips after)
 * 	1 ) Make sure there is only one question uncommented at a time. Having 2 public static void main(String[] args) methods uncommented 
 * 		at the same time will give errors, java doesn't like it. To comment and uncomment select the code and press ctrl + /
 *	2 ) I am sure his teacher told him too, but indentation is very important in order to be able to read through code easily, so make 
 *		sure the code stays indented
 *	3 ) As you can see there is some code imported at the top of the page, it is important to import these or else, for example the 
 *		scanner function wont work, because java can't reference Scanner() and same for Random() , the Math library and  the 
 *		JOptionPane library if we didn't have them imported
*/

	
	/*Question1: Simulation: How many times do you have to roll a pair of dice before they come up doubles? You could
	 * do the experiment by rolling the dice by hand or writing a computer program that simulates the
	 * experiment. The program should report the number of rolls that it makes before the dice comes up with the same number on each die.
	 */
	

//		public static void main(String[] args) {
//			Random rnd = new Random();											//initialize a random variable called rnd which called the Random() function
//			int die1;															//initializes the variables being used in the program
//			int die2; 
//			int count = 0;														//helps us count the amount of times it took to roll
//			
//			do {
//				die1 = rnd.nextInt(6)+1;										//chooses a random number between 1 and 6 ( +1 = inclusive)
//				die2 = rnd.nextInt(6)+1;										//chooses a random number between 1 and 6 ( +1 = inclusive)
//				System.out.println(die1+" "+die2);								//prints out the values of die1 and dies2 with a space in between 
//				count++;														//count of number of rolls increases to help keep track of the number
//			}
//			while(die1 != die2);												//while die1 is not the same as die2
//			System.out.println("it took "+ count + " rolls for doubles");		//we report the number of rolls to get doubles
//	
//		} 
	
	


	/*Question2: Write a program that models a simple slot machine. Three numbers from 1 to 50 are randomly generated and printed side 
	 * by side. If all three numbers match, you win the grand prize of $100, if any two of the numbers match, you win $20, no matching
	 * numbers gives no winnings. Keep playing until the user chooses to stop. Print out their final winnings at the end of play.
	 */

//		public static void main(String[] args) {												
//			int num1;															//initialize our variables
//			int num2;
//			int num3;
//			String answer = "yes";												//initialize our default answer
//			int winnerCount = 0;												//initialize our winnerCount which counts how many wins were made in total
//			int matchingCount = 0; 												//*extra* initialize our matchingCount which counts how many matches were made in total
//			Random rnd = new Random();											//initialize a random variable called rnd which called the Random() function
//			Scanner input = new Scanner(System.in);								//initialize our input variable by calling the Scanner() function
//			
//			while(answer.equals("yes")){										//while the default answer is chosen we do the following
//				num1 = rnd.nextInt(50)+1;  										//chooses a random number between 1 and 50 ( +1 = inclusive)
//				num2 = rnd.nextInt(50)+1;
//				num3 = rnd.nextInt(50)+1;
//				
//				System.out.println(num1+" "+num2+" "+num3);						//displays the random numbers side by side
//				
//				if((num1==num2) && (num2==num3)) {								//checks if num1 is the same as num2 and if num2 is the same as num3
//					System.out.println("you win!");								//prints if condition is true
//					winnerCount++;												//winner count increases by 1
//				}
//				//example input: num1 =32, num2 =32, num3 = 45
//				else if(num1==num2 || num2==num3 || num1==num3) {				//checks if num1 is the same as num2 OR num2 is the same as num3 OR num1 is th3 same as num3
//					System.out.println("you matched two numbers");				//input gets registered in the answer variable 
//				}
//				else {
//					System.out.println("no matching numbers");					//last condition: if no matches are made
//				}
//				
//				System.out.println("play again (yes/no): ");					//if answer is yes, it goes to the while loop and game loops back up again to play again
//				answer = input.next();											//receives answer
//				
//				if(answer.equals("no")) {										//considered as the "exit" condition of the game, if answer is no
//					System.out.println("You won " + winnerCount + " times!");	//prints out the total amount of wins 
//					System.out.println("You matched " + matchingCount + " times!");		//*extra* prints out the total amount of matches 
//				}
//			}
//			
//		}
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Option 2 of writing Question 2 with a Do While loop~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//		public static void main(String[] args) {	
//			int num1;																	//initialize our variables
//			int num2;
//			int num3;
//			String answer = "yes";														//initialize our default answer
//			int winnerCount = 0;														//initialize our winnerCount variable which counts how many times we win in total
//			int matchingCount = 0; 														//*extra* initialize our matchingCount which counts how many matches were made in total
//			Random rnd = new Random();													//initialize a random variable called rnd which called the Random() function
//			Scanner input = new Scanner(System.in);										//initialize our input variable by calling the Scanner() function
//			
//			do {
//				num1 = rnd.nextInt(50)+1;  												//chooses a random number between 1 and 50 (+1 = inclusive meaning 1 to 50, without the +1 it will be a range from 0 to 49)
//				num2 = rnd.nextInt(50)+1;
//				num3 = rnd.nextInt(50)+1;
//				
//				System.out.println(num1+" "+num2+" "+num3);								//displays the random numbers side by side with a space in between
//				
//				if(num1==num2 && num2==num3) {											//checks if all the numbers are equal to each other 
//					System.out.println("you win");										//prints if condition is true			
//					winnerCount++;														//winner count increases by 1
//				}
//				else if(num1==num2 || num2==num3 || num1==num3) {						//checks if num1 is the same as num2 OR num2 is the same as num3 OR num1 is th3 same as num3
//					System.out.println("you matched two numbers");						//prints if condition is true 
//					matchingCount++;													//matchingCount increases by 1
//				}
//				else {
//					System.out.println("no matching numbers");							//last condition: if no matches are made
//				}
//				
//				System.out.println("play again (yes/no): ");							//if answer is yes, it goes to the while loop and game loops back up again to play again
//				answer = input.next();													//input gets registered in the answer variable 
//				
//				if(answer.equals("no")) {												//considered as the "exit" condition of the game, if answer is no 
//					System.out.println("You won " + winnerCount + " times!");			//prints out the total amount of wins 
//					System.out.println("You matched " + matchingCount + " times!");		//*extra* prints out the total amount of matches 
//				}
//			}
//			
//			while(answer.equals("yes"));												//while the default answer is chosen we do the following
//				
//		}
		
		
		
	/*Question3: Write a program that will ask the user for a character symbol and an integer value. The code will then
	display an n by n box of the symbol character.For example, if the user enters: ‘$’ and 4, the code will display:
										$$$$
										$$$$
										$$$$
										$$$$
	*/	
		
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);										//initialize our input variable by calling the Scanner() function
			System.out.println("enter number: ");										//print out a question to enter a number
			int number = input.nextInt();												//get the input and store it in a variable called row
			System.out.println("enter symbol: ");										//print out a question to enter a symbol (eg. $,#,@,%,6...)
			String symbol = input.next();												//get the input and store it in a variable called symbol
																						//using a nested for loop
			for(int i=1; i<= number; i++) {		//row										//iterate through the row until the row is <= the inputed number
//				System.out.println(" ");												//exercise: test and see what happens when you uncomment this, how does this change the output?
				for(int j =1; j<= number; j++) {		//col								//iterate through the columns until the row is <= the inputed number
//					System.out.print(" ");												//exercise: test and see what happens when you uncomment this, how does this change the output?
//					System.out.println(" ");											//exercise: test and see what happens when you uncomment this, how does this change the output?
					System.out.print(symbol);											//prints the symbol n times (columns) and in n rows
				}
				System.out.println();													//prints a new line for each new row
			}
		}
		
		 
	/* Question4: Banking: You have been hired by D’Angelo Banking to write a program that will calculate the amount of
	*an investment for its clients. This question requires dialog boxes.
	*/		
		
//		public static void main(String[] args) {
//			String principle;																	//initialize our variables
//			String rate;
//			String time;
//			
//			principle = JOptionPane.showInputDialog("enter principle (amount of money): ");		//setting principle be equal to the input the user enters in the dialog box
//			rate = JOptionPane.showInputDialog("enter rate %: ");								//setting rate be equal to the input the user enters in the dialog box
//			time = JOptionPane.showInputDialog("enter time (in years): ");						//setting time be equal to the input the user enters in the dialog box
//			
//																								//create new double version of our String variable, in order for our program to store them with values
//			double principleD;																	//initialize our variables
//			double rateD = 0.0;
//			double timeD;
//			double temp = 0.0;
//			double amount = 0.0;
//			
//			principleD=Double.parseDouble(principle);											//convert the value of the string variable to our new double variable
//			rateD=Double.parseDouble(rate);
//			timeD=Double.parseDouble(time);
//																								//print statement to help us see what values are being outputted/registered into the variables (dont need to be included in the code)
//			System.out.println("principle: " + principleD);										
//			System.out.println("rate: " + rate);
//			System.out.println("years: " + time);
//			
//			temp = principleD*Math.pow(1 + rateD, timeD);										//applying the formula from the question
//			temp += amount;																		//set the temp variable be equal to the amount (helps us pass in values in a more organized way)
//			amount = Math.floor(temp*100) / 100;												//using the math.floor library to return the largest integer less than or equal to a given number
//			
//			DecimalFormat formatter = new DecimalFormat("0.00");								//specifying the formatting of the outputted number
//			
//			System.out.println("your investment is worth: $"+ formatter.format(amount));			//print statement to help us see what values are being outputted/registered into the variables(dont need to be included in the code)
//			System.out.println("your investment per month is worth: $"+ formatter.format(amount/(timeD*12)));	//print statement to help us see what values are being outputted/registered into the variables(dont need to be included in the code)
//			
//			JOptionPane.showMessageDialog(null, "your investment is worth: $" + formatter.format(amount));			//printing out the final amount overall in the message dialog box
//			JOptionPane.showMessageDialog(null, "your investment per month is worth: $" + formatter.format(amount/(timeD*12)));		//printing out the final amount per month in the message dialog box
//			
			
			//			~RUNDOWN OF THE MATH~
			//			to calculate for the t years:
			//			amount = principleD( 1+ rateD)^timeD     we use the formula provided
			//					 = 100(1+4)^5
			//					 = 312500
						
			//			to calculate for each month:			 we divide our previous result by the number of months multiplied by the amount of months in a year
			//					 312500/(5*12)
			//					 312500/60
			//					 =5208.3
		//}
		
		
		
		
		
}















