import java.util.*;
public class Prices
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

        int min=arr[0],prof=0;
        for(int i=1;i<n;i++)
        {
            if(min > arr[i])
            {
                min=arr[i];
            }
            int diff=arr[i]-min;
            if(prof < diff)
            {
                prof=diff;
            }
        }

        System.out.print("Max profit: "+prof);
        

    }
}