/*

Write a Java Program to print the following pattern:

4321
4321
4321
4321

Take number of rows as input from user.

*/

import java.util.Scanner;

public class Pattern7
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = numberOfRows;
			while(column <= numberOfRows)
			{
				System.out.print(column);
				column--;
				if(column == 0)
				   break;
			}
			System.out.print("\n");
			row++;
		}
	}
}
