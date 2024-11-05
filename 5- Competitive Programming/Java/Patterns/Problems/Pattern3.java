/*

Write a Java Program to print the following pattern:

1
12
123
1234

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern3
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
				System.out.print(column);
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
