/*

Write a Java Program to print the following pattern:

E
DE
CDE
BCDE
ABCDE

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern17
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toPrint;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			toPrint = 64 + numberOfRows - row + 1;
			while(column <= row)
			{
				System.out.print((char)(toPrint + column - 1));
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
