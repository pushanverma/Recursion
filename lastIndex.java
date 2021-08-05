import java.util.*;

public class lastIndex {
    public static int lastelement(int arr[],int idx,int t)
    {
        if(idx==arr.length)
        {
            return -1;
        }

        //liisa=last index in small array
        int liisa=lastelement(arr,idx+1,t);
        if(liisa ==-1)
        {
            if(arr[idx]==t)
            {
                return idx;
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return liisa;
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
        System.out.println("Enter your target-");
        int t=scn.nextInt();
        int li=lastelement(arr,0,t);
        System.out.println("last index of "+t+" is- "+li);
    }
}


