class Solution {
    public boolean judgeSquareSum(int c) 
    {
        long left = 0, right = (long) Math.sqrt(c), l1, r1;
        while (left <= right) 
        {
            l1=left * left;
            r1=right * right;

            if (l1 + r1 == c) 
                return true;
            else if (l1 + r1 > c) 
                right--;
            else 
                left++;
        }
        return false;
    }
}