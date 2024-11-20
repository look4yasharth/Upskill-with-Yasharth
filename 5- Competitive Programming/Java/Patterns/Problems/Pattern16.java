/*

Write a Java Program to print the following pattern:

A
BC
CDE
DEFG

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern16
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= row)
			{
				System.out.print((char)(64 + row + column - 1));
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
