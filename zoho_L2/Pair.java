import java.util.*;
public class Pair
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter n value : ");
        int n=x.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=x.nextInt();
        }
        System.out.print("Enter target : ");
        int target = x.nextInt();
        // int []diff = new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     diff[i]=Math.abs(arr[i]-target);
        // }

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {

        //         if(arr[i]==diff[j])
        //         {
        //             System.out.print("True");
        //             System.exit(0);
        //         }
        //     }
        // }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(arr[i]-arr[j])==target)
                {
                    System.out.print("True");
                    System.exit(0);
                }
            }
        }
        
        System.out.print("False");

        
    }
}