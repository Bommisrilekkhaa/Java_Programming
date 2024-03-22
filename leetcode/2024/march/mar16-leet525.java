class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int zero = mp.get(0);
        int one = mp.get(1);
        return Math.min(zero,one)*2;
    }
}