/*

Write a Java Program to print the following pattern:

   1
  232
 34543
4567654

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern26
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toBePrinted;
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
			toBePrinted = row;
			while(column <= numberOfRows)
			{
				System.out.print(toBePrinted);
				column++;
				toBePrinted++;
			}
			column = 1;
			toBePrinted = 2*(row - 1);
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
