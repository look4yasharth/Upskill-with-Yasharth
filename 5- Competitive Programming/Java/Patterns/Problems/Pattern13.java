/*

Write a Java Program to print the following pattern:

ABCD
ABCD
ABCD
ABCD

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern13
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
				System.out.print((char)(64 + column));
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
