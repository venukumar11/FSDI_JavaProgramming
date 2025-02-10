//WAP to take input and as many prime numbers as given input
import java.util.Scanner;
class PrimeNumbers 
{
	public static boolean isPrime(int n)
	{
		if (n<=1)
		{
			return false;
		}
		for (int i=2;i<=n/2;i++)
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter requried number of prime numbers:");
		int count=0,n=s.nextInt();
		for (int i=1; ;i++ )
		{
			if (isPrime(i))
			{
				System.out.println(i);
				count++;
			}
			if (count==n)
			{
				break;
			}
		}
	}
}
