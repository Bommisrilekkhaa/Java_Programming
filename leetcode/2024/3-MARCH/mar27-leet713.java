class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        int count=0;
        if(k<=1)
            return 0;
        
        int l=0,r=0,mul=1;

        while(r<nums.length)
        {
            mul*=nums[r];
            while(mul>=k)
                mul/=nums[l++];
            count+= 1+(r-l);
            r++;
        }
        return count;
        
    }
}