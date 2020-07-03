import java.io.*;
import java.util.*;

public class BinarySearch 
{
    static int BinarySearch(int[] arr,int l, int r, int key) 
    {
        if (r >= l) 
        { 
            int mid = l + (r - l) / 2;
            if (arr[mid] == key) 
                return mid; 
            if (arr[mid] > key) 
                return BinarySearch(arr, l, mid - 1, key); 
            return BinarySearch(arr, mid + 1, r, key); 
        } 
        return -1;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0 ; i<n ; i++) 
            a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i=0 ; i<m ; i++) 
            b[i] = sc.nextInt();
    
        for (int i=0 ; i<m ; i++) 
            System.out.print(BinarySearch(a, 0, a.length - 1, b[i]) + " ");
    }      
}
