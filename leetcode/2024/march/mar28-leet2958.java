class Solution {
    public int maxSubarrayLength(int[] nums, int k) 
    {
        int start = 0, end = 0, max = 0, n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        while (end < n) 
        {
            int curr = nums[end];
            mp.put(curr, mp.getOrDefault(curr, 0) + 1);

            if (mp.get(curr) > k) 
            {
                while (nums[start] != curr)
                    mp.put(nums[start], mp.get(nums[start++]) - 1);
                mp.put(nums[start], mp.get(nums[start++]) - 1);
            }
            max = Math.max(max, end - start + 1);
            end++;
        }
        return max;
    }
}