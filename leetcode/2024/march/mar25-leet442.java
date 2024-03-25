class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        List<Integer> l=new ArrayList<>();
        int c=1;
        for(int a:nums)
        {
            if(mp.containsKey(a))
            l.add(a);
            else
            mp.put(a,c);
        }
        return l;
    }
}