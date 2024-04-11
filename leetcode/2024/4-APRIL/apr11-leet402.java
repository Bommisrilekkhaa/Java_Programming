import java.math.*;
class Solution 
{
    public String removeKdigits(String num, int k) 
    {
        Stack<Character> s = new Stack<>();
        
        for(int i=0;i<num.length();i++)
        {
            while(!s.isEmpty() && num.charAt(i)<s.peek() && k>0 )
            {
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }
        while(k!=0)
        {
            s.pop();
            k--;
        }
        String fnum="";

        while(!s.isEmpty())
        {
            fnum=String.valueOf(s.pop())+fnum;
        }

        if(fnum.length()==0)
            return "0";

        return new BigInteger(fnum).toString();

    }
}