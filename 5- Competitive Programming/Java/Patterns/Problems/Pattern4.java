/*

Write a Java Program to print the following pattern:

1111
2222
3333
4444

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern4
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toPrint = 1;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= numberOfRows)
			{
				System.out.print(toPrint);
				column++;
			}
			System.out.print("\n");
			row++;
			toPrint++;
		}
	}
}
