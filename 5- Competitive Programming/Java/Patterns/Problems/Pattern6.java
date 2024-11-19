/*

Write a Java Program to print the following pattern:

4444
4444
4444
4444

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern6
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
				System.out.print(numberOfRows);
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
