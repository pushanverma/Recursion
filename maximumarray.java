import java.util.*;

public class maximumarray {
    public static int maximum(int arr[],int idx)
    {
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        //misa=minimum in smaller array
        int misa =maximum(arr,idx+1);
        if(misa>arr[idx])
        {
            return misa;
        }
        else
        {
            return arr[idx];
        }
        
    }

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int mx=maximum(arr,0);
        System.out.println("Maximum-"+mx);

    }
}
