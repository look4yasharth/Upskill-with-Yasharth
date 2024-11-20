/*

Write a Java Program to print the following pattern:

ABCD
BCDE
CDEF
DEFG

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern14
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
				System.out.print((char)(64 + row + column - 1));
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
