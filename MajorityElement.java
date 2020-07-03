import java.util.*;
import java.io.*;

public class MajorityElement 
{
    static int getMajorityElement(int[] a, int len) 
    {
        int maj_index = 0, count = 1; 
        for (int i=1 ; i<len ; i++)    
        { 
            if (a[maj_index] == a[i]) 
                count++; 
            else
                count--; 
            if (count == 0) 
            { 
                maj_index = i; 
                count = 1; 
            } 
        } 
        int c_key = a[maj_index];
        if(ismajority(a, len, c_key) == 1)
            return 1;
        return -1;
    }

    static int ismajority(int[] a, int size, int cand)
    {
        int count = 0;
        for(int i=0 ; i<size ; i++)
        {
            if(a[i] == cand)
                count++;
        }
        if(count > size/2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) 
    {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();
        if (getMajorityElement(a, a.length) != -1)
            System.out.println(1);
        else 
            System.out.println(0);
    }
    static class FastScanner 
    {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) 
        {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() 
        {
            while (st == null || !st.hasMoreTokens()) 
            {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() 
        {
            return Integer.parseInt(next());
        }
    }
}

