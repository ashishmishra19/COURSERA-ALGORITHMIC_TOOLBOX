import java.util.*;

public class Fibonacci 
{
	static int fib(int n)
	{
		int arr[]=new int[n+1];
		arr[0]=0;
		if(n>0)
		{
			arr[1]=1;
			for(int i=2;i<=n;i++)
				arr[i]=arr[i-1]+arr[i-2];
		}
		return arr[n];
	}
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(fib(n));
	}
}
