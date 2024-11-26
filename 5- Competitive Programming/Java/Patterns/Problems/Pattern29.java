/*

Write a Java Program to print the following pattern:

   *
  ***
 *****
*******
 *****
  ***
   * 

Take number of rows as input from user.
NOTE: Number of Rows are always odd.

*/

/*
  
  NOTE:

  Already done this question, 
  this is another method to solve the same question.   
 
*/

import java.util.Scanner;

public class Pattern29
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, upperHalfRows, lowerHalfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		upperHalfRows = (numberOfRows / 2) + 1;
		lowerHalfRows = numberOfRows / 2;
		while(row <= upperHalfRows)
		{
			column = 1;
			while(column <= upperHalfRows - row)
			{
				System.out.print(" ");
				column++;
			}
			column = 1;
			while(column <= 2*row - 1)
			{
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
			row++;
		}
		row = lowerHalfRows;
		while(row >= 1)
		{
			column = 1;
			while(column <= lowerHalfRows - row + 1)
			{
				System.out.print(" ");
				column++;
			}	
			column = 1;
			while(column <= 2*row - 1)
			{
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
			row--;	
		}
	}
}
