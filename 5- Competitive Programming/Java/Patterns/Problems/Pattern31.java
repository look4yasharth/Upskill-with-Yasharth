/*

Write a Java Program to print triangle of user defined integers sum.

Constraints:
0 <= N <= 50

Sample Input 1:
3

Sample Output 1:

1=1
1+2=3
1+2+3=6

Sample Input 2:
5

Sample Output 2:

1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

*/

import java.util.Scanner;

public class Pattern31
{
	public static void main(String args[])
	{
		int sum, row = 1, column, numberOfRows;
		Scanner sc = new Scanner(System.in);
		numberOfRows = sc.nextInt();
		while(row <= numberOfRows)
		{
			column = 1;
			sum = 0;
			while(column <= row)
			{
				System.out.print(column);
				sum += column;
				if(column != row)
					System.out.print("+");
				column++;
			}
			System.out.println("="+sum);
			row++;
		}
	}
}
