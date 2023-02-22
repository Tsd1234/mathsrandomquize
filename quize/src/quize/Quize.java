
package quize;

import java.util.*;

public class Quize 
{

	public static Scanner keyboard = new Scanner(System.in); //declares to recive inputes
	
	public static void main(String[] args) //main method 
	{
	
		System.out.print("How many math questions do you would u like to work on: ");
		int inputed = keyboard.nextInt();

		keyboard.nextLine(); //clears buffer (needed for use of scanner again)
		
		if (inputed == 0) //conditional checking if j is 0
		{
		    System.out.println("DO you not want to enter value\n");
		    System.exit(0); //closes program
		 }
		    
		if (inputed < 0) //this conditional is for if the user enters a negative value
		   inputed = inputed * -1; //converts negative input to positive to avoid errors
		
		int i = 0; //initializes counter variable, i
		while (i < inputed) //loop that will run as long as counter is lower than the number input by user
		{
		    random(); //calls randy method
		    i++; //increments i by 1
		}
		
		output(); //calls finaloutput method after loop finishes
		
	}
	
	
	public static void random() //randy method is used for creating random numbers and passing them to calc method
	{
		Random random1 = new Random(); //declares random1 as a new random variable
		Random random2 = new Random(); //declares random2
		int num1 = random1.nextInt(10)+1; //makes num1 equal to a random number between 1 and 10
		int num2 = random1.nextInt(10)+1; //does the same for num2
		int oper = random2.nextInt(3); //makes oper equal to a random number between 0 and 2 for deciding an operation

 		calc(num1,num2,oper); //passes the three random values to calc method
	}
	
	public static int right = 0; //public integers for keeping track of score
	public static int wrong = 0;
	
	public static void calc(int a, int b, int c) //accepts values passed to it from random method
	{
		
		double answer = 0; //declares answer variable
		
		if (c == 0) //conditional checking if third random number generated is 0
		{
		    answer = a + b; //answer to upcoming problem
		    System.out.print("What is " + a + " + " + b + ": "); 
		}
		
		if (c == 1) //conditional if random number is 1
		{
		    answer = a - b; //answer is stored in memory
		    System.out.print("What is " + a + " - " + b + ": "); //gives subtraction problem
		}
		
		if (b == 2) //if random number is 2
		{
		    answer = a * b; //answer stored in memory
		    System.out.print("What is " + a + " x " + b + ": "); //multiplication problem
		}
		
		
		double input = keyboard.nextDouble(); 
		
		if (input == answer) //if user's answer is correct
		    {
		    System.out.println("That is correct!\n");
		    right++; //ups count of numright
		    }
		    
		else //if user is wrong
		    {
		    System.out.println("That is incorrect! The answer is " + answer + "\n");
		    wrong++; //ups count of numwrong
		    }
		       
	}
	
	public static void output() 
	{
		double ansewerdpercentage = right*100 / (right + wrong); //finds the percentage of questions answered correctly
		
		System.out.println("The number of questions you answered correctly is " + right + " and the number you answered incorrectly is " + wrong + ". The percentage of questions answered correctly is " + ansewerdpercentage + "%.\n");
	}
}

