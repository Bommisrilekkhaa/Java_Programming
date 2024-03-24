class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int c=1;
        int ans=-1;
        for(int i=0;i<n;i++){
            c=1;
            if(mp.containsKey(nums[i]))
            c++;
            mp.put(nums[i],c);
            if(c>1)
            ans=nums[i];
        }
        

        return ans;
    }
}