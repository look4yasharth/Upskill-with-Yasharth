/*

Write a Java Program to print the following pattern:

4321
4321
4321
4321

Take number of rows as input from user.

*/

/*
  
  NOTE:

  Already done this question, 
  this is another method to solve the same question.   
 
*/

import java.util.Scanner;

public class Pattern8
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= numberOfRows)
			{
				System.out.print(numberOfRows - column + 1);
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
