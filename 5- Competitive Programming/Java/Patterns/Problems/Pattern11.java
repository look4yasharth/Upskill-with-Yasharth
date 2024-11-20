/*

Write a Java Program to print the following pattern:

1
22
333
4444

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern11
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
				System.out.print(row);
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
