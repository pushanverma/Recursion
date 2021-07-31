import java.util.*;

public class factorialrec {
    
    public static int fact(int n)
    {
        if(n==1)
        {
        return 1;
        }

        int f=n*fact(n-1);
        return f;
    }
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();
        int q=fact(n);
        System.out.println(n +"!="+q);
    }
}
