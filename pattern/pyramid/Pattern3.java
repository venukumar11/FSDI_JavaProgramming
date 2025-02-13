/*
4321234
 32123
  212
   1
*/

import java.util.Scanner;
class Pattern3
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int r=1;r<=n ;r++ )
		{
			int a=(n+1)-r;
			for (int c=1;c<=2*n-1 ;c++ )
			{
				if (c>=r && c+r<=2*n)
				{
					System.out.print(c<n? a-- : a++);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
