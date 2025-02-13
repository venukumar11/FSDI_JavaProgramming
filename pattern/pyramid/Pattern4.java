/*
1010101
 10101
  101
   1
*/
import java.util.Scanner;
class Pattern4
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
					System.out.print(((r+c+n)%2==0)? 1 : 0);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
