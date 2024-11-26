/*

Write a Java Program to print Half Diamond pattern using stars and numbers

Note: There are no spaces between the characters in a single line.

Constraints:
0 <= Total Number of Rows <= 50

Sample Input 1:
3

Sample Output 1:

*
*1*
*121*
*12321*
*121*
*1*
*

Sample Input 2:
5

Sample Output 2:

*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;

public class Pattern28
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		System.out.println("*");
		while(row <= (2*numberOfRows)-1)
		{
			if(row <= numberOfRows)
			{
				System.out.print("*");
				column = 1;
				while(column <= row)
				{
					System.out.print(column);
					column++;
				}
				column = row - 1;
				while(column >= 1)
				{
					System.out.print(column);
					column--;
				}
				System.out.print("*");
			}
			else
			{
				System.out.print("*");
				column = 1;
				while(column <= (2*numberOfRows)-row)
				{
					System.out.print(column);
					column++;
				}	
				column -= 2;
				while(column >= 1)
				{
					System.out.print(column);
					column--;
				}
				System.out.print("*");
			}
			System.out.println();
			row++;
		}
		System.out.print("*");
	}
}
