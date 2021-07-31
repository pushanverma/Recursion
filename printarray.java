import java.util.*;

public class printarray {

    public static void printarr(int arr,int n,int index)
    {
        if(arr<0)
        {
            return;
        }
        System.out.println(arr[index]);
        printarr(arr,n,index-1);
    }
    
    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr=new int[n];
        int i=0;
        for( i=0;i<n;i++)
        {
                arr[i]=scn.nextInt();
        }
        
        printarr(arr,n,i);
    }
}
