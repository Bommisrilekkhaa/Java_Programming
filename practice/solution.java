import java.util.*;

class solution
{
  public static void main(String args[])
  {
    Scanner x=new Scanner(System.in);
    String s1=x.next();
    String s2=x.next();
    int n1=s1.length();
    int n2=s2.length();
    int l=0,m=0,l1=0,m1=0;
    for(int i=0;i<n1;i++)
    {
      if(s1.charAt(i)=='L')
        l++;
      else
        m++;
    }
    for(int i=0;i<n2;i++)
    {
      if(s2.charAt(i)=='L')
        l1++;
      else
        m1++;
    }
    if((l*m)>(l1*m1))
      System.out.print("Ashok");
    else if((l*m)<(l1*m1))
      System.out.print("Anand");
    else
      System.out.print("Draw");
  }
}