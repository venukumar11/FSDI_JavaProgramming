/*
-------------
*           *

* *       * *

* * *   * * *

* * * * * * *

* * *   * * *

* *       * *

*           *
-------------
*/

import java.util.Scanner;
class Pattern7
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int r=1;r<=(2*n)-1;r++ )
		{
			for (int c=1;c<=2*n-1 ;c++ )
			{
				if (r-c<n && c+r>n)
				{
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
