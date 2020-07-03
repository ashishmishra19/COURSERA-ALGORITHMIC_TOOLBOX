import java.util.*;
import java.io.*;

public class Max_Pairwise_Product 
{
    static long getMaxPairwiseProduct(int[] numbers) 
    {
        int n = numbers.length;
        int max_index1 = -1, max_index2 = -1;
        for (int i = 0; i < n; i++) 
        {
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;
        }

        for (int j = 0; j < n; j++) 
        {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;
        }
        return (long)numbers[max_index1] * numbers[max_index2];
    }
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++)
            numbers[i] = sc.nextInt();
        
        System.out.println(getMaxPairwiseProduct(numbers));
     }
}  