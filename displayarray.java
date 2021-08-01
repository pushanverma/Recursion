import java.util.*;

public class displayarray {
    public static void display(int []arr,int index)
    {
        if(index==arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        display(arr,index+1);
    }

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int []arr =new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        display(arr,0);
    }
}
