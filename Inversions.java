import java.io.*;
import java.util.*;

public class Inversions 
{
    private static long Merge(int[] arr, int l, int m, int r) 
    {
        int[] left = Arrays.copyOfRange(arr, l, m + 1); 
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); 
  
        int i = 0, j = 0, k = l, swaps = 0; 
        while (i<left.length && j<right.length) 
        { 
            if (left[i] <= right[j]) 
                arr[k++] = left[i++]; 
            else 
            { 
                arr[k++] = right[j++]; 
                swaps += (m + 1) - (l + i); 
            } 
        } 
        while (i < left.length) 
            arr[k++] = left[i++]; 

        while (j < right.length) 
            arr[k++] = right[j++]; 
  
        return swaps; 
    }

    private static long getNumberOfInversions(int[] arr, int left, int right) 
    {
        long noofinversions = 0;
        if (left < right)
        {   
            int mid = (left + right) / 2;
            noofinversions += getNumberOfInversions(arr, left, mid);
            noofinversions += getNumberOfInversions(arr, mid + 1, right);
            noofinversions += Merge(arr, left, mid, right);
        }
        return noofinversions;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = sc.nextInt();
        System.out.println(getNumberOfInversions(a, 0, a.length - 1));
    }
}

