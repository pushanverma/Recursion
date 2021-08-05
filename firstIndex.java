import java.util.Scanner;

import java.util.*;

public class firstIndex {

    public static int firstelement(int arr[],int idx,int t)
    {
        if(arr[idx]==t)
        {
            return idx;
        }
        else
        {
            //fiisa= first index in small array
            int fiisa=firstelement(arr, idx+1, t);
            return fiisa;
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
        System.out.println("enter your target-");
        int t=scn.nextInt();
        int fi=firstelement(arr,0,t);
        System.out.println("first index of "+t+" is -"+fi);
    }
    
}
