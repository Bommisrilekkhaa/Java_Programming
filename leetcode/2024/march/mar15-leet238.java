class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] prod = new int[n];
        Arrays.fill(prod,1);

        for(int i=n-2;i>=0;i--)
            prod[i] = nums[i+1]*prod[i+1];
        
        int mul = 1;
        for(int j=1;j<n;j++)
        {
            mul *= nums[j-1];
            prod[j] *= mul;
        }
        return prod;
    }
}