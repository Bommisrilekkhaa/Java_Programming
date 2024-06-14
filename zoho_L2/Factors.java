import java.util.*;
public class Factors
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

        int[] fac = new int[n];
        for(int i=0;i<n;i++)
        {
            int sqr=(int)Math.sqrt(arr[i]);
            int c=0;
            for(int j=1;j<=sqr;j++)
            {
                if(j==sqr && arr[i]%j==0)
                {
                    c++;
                }
                else if(arr[i]%j==0)
                {
                    c+=2;
                }
            }
            fac[i]=c;
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(fac[i]<fac[j])
                {
                    int t=fac[i];
                    fac[i]=fac[j];
                    fac[j]=t;

                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}