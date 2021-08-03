import java.util.*;

public class maximumarray {
    public static int maximum(int arr[],int idx)
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[0])
            {
                max=arr[i];
            }
        }
        return max; 
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
