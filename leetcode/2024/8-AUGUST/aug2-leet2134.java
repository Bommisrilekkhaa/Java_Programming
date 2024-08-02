class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int tot = 0;

        for (int num : nums) 
            tot += num;
        

        if (tot == 0 || tot == n) 
            return 0;

        int cur = 0;

        for (int i = 0; i < tot; i++) 
            cur += nums[i];
        

        int max = cur;

        for (int i = 0; i < n; i++) 
        {
            cur -= nums[i];
            cur += nums[(i + tot) % n];
            max = Math.max(max, cur);
        }

        return tot - max;
    }
}