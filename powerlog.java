import java.util.*;
import java.lang.Math;

public class powerlog {

    public static int powerlog1(int x,int n)
    {
        if(n==0) //base case
        {
            return 1;
        }
        
            int q=(int) Math.pow(x,n/2);
            int q1=q*q;
        
        if(n%2==1)
        {
            int q2=q1*x;
            return q2; 
        }
        return q1;
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int po=powerlog1(x,n);
        System.out.println(po);
    }
}
