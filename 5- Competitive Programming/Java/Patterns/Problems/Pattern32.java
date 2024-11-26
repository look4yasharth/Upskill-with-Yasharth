/*

Write a Java Program to print the following pattern:

1357
3571
5713
7135

Take number of rows as input from user.

Constraints:
0 <= N <= 50

Sample Input 1:
3

Sample Output 1:

135
351
513

Sample Input 2:
5

Sample Output 2:

13579
35791
57913
79135
91357

*/

import java.util.Scanner;

public class Pattern32
{
	public static void main(String args[])
	{
		int row = 1, column, numberOfRows, toBePrinted;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			toBePrinted = 2*row - 1;
			while(column <= numberOfRows)
			{
				System.out.print(toBePrinted);
				toBePrinted += 2;
				if(toBePrinted > 2*numberOfRows - 1)
					toBePrinted = 1;
				column++;
			}
			System.out.print("\n");
			row++;
		}
	}
}
