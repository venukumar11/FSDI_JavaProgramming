/*
1111111
 22222
  333
   4
*/

import java.util.Scanner;
class Pattern1 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int r=1;r<=n ;r++ )
		{
			for (int c=1;c<=2*n-1 ;c++ )
			{
				if (c>=r && c+r<=2*n)
				{
					System.out.print(r);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
