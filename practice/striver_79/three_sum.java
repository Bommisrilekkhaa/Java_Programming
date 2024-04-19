class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<ArrayList<Integer>> s = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
                continue;

            int j = i+1;
            int k=nums.length-1;
            while(j < k)
            {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum > 0)
                    k--;
                else if(sum < 0)
                    j++;
                else
                {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    s.add(l);

                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
            }
            
        }
        // for(List<Integer> l1:s)
        // {
        //     ans.add(l1);
        // }
        ans.addAll(s);
        return ans;
    }
}
