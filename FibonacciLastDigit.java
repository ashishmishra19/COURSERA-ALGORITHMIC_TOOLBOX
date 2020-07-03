import java.util.*;

public class FibonacciLastDigit 
{
    static int fib(int n)
    {
        if(n<1)
            return n;
        int arr[]=new int[n+1];
        arr[0]=0;
        if(n>0)
        {
            arr[1]=1;
            for(int i=2; i<=n; i++)
                arr[i]=arr[i-1]+arr[i-2] % 10;
        }
        int index = (int)(n % 60L);
        return arr[index];
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n)%10);
    }
}

