import java.util.*;

public class Fibonacci 
{
    static long fib(long n)
    {
        long arr[]=new long[n];
        arr[0]=0;
        if(n>0)
        {
            arr[1]=1;
            for(int i=2; i<=n; i++)
                arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
    public static void main(String args[]) 
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        System.out.println(fib(n));
    }
}
