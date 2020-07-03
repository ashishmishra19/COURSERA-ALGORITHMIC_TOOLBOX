import java.io.*;
import java.util.Scanner;

public class Change 
{
    static int getChange(int m) 
    {
    	if(m < 10)
    	{
    		if(m < 5)
    			return m;
			else
    			return (m-5)+1;
    	}
    	else
    	{
    		int ten = m / 10;
    		m -= ten * 10;
    		if(m > 4)
				return ten + 1 + (m - 5);
			else 
				return ten + m;
    	}
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
		System.out.println(getChange(m));    
	}
}

