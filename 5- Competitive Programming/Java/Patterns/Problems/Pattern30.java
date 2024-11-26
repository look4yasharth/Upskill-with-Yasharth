/*

Write a Java Program to print parallelogram pattern for the given N number of rows.
Take Number of Rows as input from user.

Constraints:
0 <= N <= 50

Sample Input 1:
3

Sample Output 1:

***
 ***
  ***

Sample Input 2:
5

Sample Output 2:

*****
 *****
  *****
   *****
    *****

*/

import java.util.Scanner;

public class Pattern30
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			while(column <= row - 1)
			{
				System.out.print(" ");
				column++;
			}
			column = 1;
			while(column <= numberOfRows)
			{
				System.out.print("*");
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
