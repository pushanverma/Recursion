import java.util.*;

public  class printdecreasing
{

    public static void printdec(int n) // expectation and faith ka milan 
    {
        if(n==0)
        {
            return ;
        }
        System.out.println(n);  
        printdec(n-1); // faith wala part 
    }
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        printdec(n) ; // we are calling function because we are expecting an output:EXPECTATION

    }

}