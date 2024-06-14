import java.util.*;
public class Pairs
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
        Arrays.sort(arr);
        int i=0,j=n-1;
        while(i<j)
        {
            if(Math.abs(arr[i]-arr[j])>target)
            {
                j--;
            }
            else if(Math.abs(arr[i]-arr[j])<target)
            {
                i++;
            }
            else
            {

                System.out.print("True");
                System.exit(0);
            }
        }
        j++;
        
        if(Math.abs(arr[i]-arr[j])==target)
            System.out.print("True");
        else
            System.out.print("False");
    }
}