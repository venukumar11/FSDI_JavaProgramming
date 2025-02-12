/*
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
*/
import java.util.Scanner;
class  Pattern1
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		for (int r=1;r<=n ;r++ )
		{
			int a=r;
			for (int c=1;c<=n ;c++ )
			{
				System.out.print(a+" ");
				a+=n;
			}
			System.out.println();
		}
	}
}
