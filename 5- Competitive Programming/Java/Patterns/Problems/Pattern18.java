/*

Write a Java Program to print the following pattern:

   *
  **
 ***
****

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern18
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= numberOfRows - row)
			{
				System.out.print(" ");
				column++;
			}
			while(column <= numberOfRows)
			{
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
