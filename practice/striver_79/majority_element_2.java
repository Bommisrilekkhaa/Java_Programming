class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,e1=0,e2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(c1==0 && nums[i]!=e2)
            {
                c1=1;
                e1=nums[i];
            }
            else if(c2==0 && nums[i]!=e1)
            {
                c2=1;
                e2=nums[i];
            }
            else if(e1==nums[i])    
                c1++;
            else if(e2==nums[i])    
                c2++;
            else
            {
                c1--;
                c2--;
            }

        }

        List<Integer> l = new ArrayList<>();
        c1=0;c2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(e1==nums[i])
                c1++;
            else if(e2==nums[i])
                c2++;
        }

        int min = (int)Math.floor(nums.length/3);

        if(c1 > min)
            l.add(e1);
        if(c2 > min)
            l.add(e2);
    
        return l; 
    }
}