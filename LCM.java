import java.math.*; 
import java.lang.*; 
import java.util.*;

public class LCM 
{
  public static BigInteger lcm(String a, String b) 
    { 
        BigInteger s = new BigInteger(a); 
        BigInteger s1 = new BigInteger(b); 
        BigInteger mul = s.multiply(s1); 
        
        BigInteger gcd = s.gcd(s1); 
  
        // calculate lcm using formula: lcm * gcd = x * y 
        BigInteger lcm = mul.divide(gcd); 
        return lcm; 
    } 

    public static void main(String[] args) 
    { 
        Scanner s = new Scanner(System.in);
        String a=s.next();
        String b=s.next();
        System.out.print(lcm(a, b)); 
    }
}
