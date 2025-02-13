/*
1234567
 12345
  123
   1
*/
import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for (int r=1;r<=n ;r++ )
		{
			int a=1;
			for (int c=1;c<=2*n-1 ;c++ )
			{
				if (c>=r && c+r<=2*n)
				{
					System.out.print(a++);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
