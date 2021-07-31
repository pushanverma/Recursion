import java.util.*;

public class decreasing
{
    public static void dec(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n); //print
        dec(n-1);   //faith
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        dec(n);
    }
}
