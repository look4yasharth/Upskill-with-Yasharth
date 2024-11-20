/*

Write a Java Program to print the following pattern:

1
23
345
4567

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern9
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toPrint;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			toPrint = row;
			while(column <= row)
			{
				System.out.print(toPrint);
				column++;
				toPrint++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
