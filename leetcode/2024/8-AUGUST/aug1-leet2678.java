class Solution {
    public int countSeniors(String[] details) 
    {
        int c=0;
        for(String s:details)
        {
            int i=Integer.valueOf(s.substring(11,13));
            if(i>60)
                c++;
        }
        return c;
    }
}