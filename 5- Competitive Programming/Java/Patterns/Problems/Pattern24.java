/*

Write a Java Program to print the following pattern:

   1
  121
 12321
1234321

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern24
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toBePrinted;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		toBePrinted = numberOfRows;
		while(row <= numberOfRows)
		{
			toBePrinted = 1;
			column = 1;
			while(column <= numberOfRows - row)
			{
				System.out.print(" ");
				column++;
			}
			while(column <= numberOfRows)
			{
				System.out.print(toBePrinted);
				column++;
				toBePrinted++;
			}
			column = 1;
			toBePrinted = row - 1;
			while(column <= row - 1)
			{
				System.out.print(toBePrinted);
				column++;
				toBePrinted--;
			}
			System.out.print("\n");
			row++;
		}
	}
}
