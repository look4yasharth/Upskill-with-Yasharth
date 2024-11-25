/*

Write a Java Program to print the following pattern:

****
***
**
*

Take number of rows as input from user.

*/

/*
  
  NOTE:

  Already done this question, 
  this is another method to solve the same question.   
 
*/

import java.util.Scanner;

public class Pattern21
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= numberOfRows - row + 1)
			{
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
