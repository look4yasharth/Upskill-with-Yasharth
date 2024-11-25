/*

Write a Java Program to print the following pattern:

4444
333
22
1

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern23
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toBePrinted;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		toBePrinted = numberOfRows;
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= numberOfRows - row + 1)
			{
				System.out.print(toBePrinted);
				column++;
			}
			System.out.print("\n");
			row++;
			toBePrinted--;
		}
	}
}
