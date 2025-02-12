/*
a e i m
b f j n
c g k o
d h l p
*/
import java.util.Scanner;
class  Pattern2
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		for (int r=1;r<=n ;r++ )
		{
			char a=(char)(96+r);
			for (int c=1;c<=n ;c++ )
			{
				System.out.print(a+" ");
				a+=n;
			}
			System.out.println();
		}
	}
}
