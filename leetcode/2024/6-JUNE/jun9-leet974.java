public class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> p = new HashMap<>();
        p.put(0, 1);

        for (int num : nums) 
        {
            sum += num;
            int mod = sum % k;

            if (mod < 0) 
            {
                mod += k;
            }
            
            if (p.containsKey(mod)) 
            {
                count += p.get(mod);
                p.put(mod, p.get(mod) + 1);
            } 
            else 
            {
                p.put(mod, 1);
            }
        }
        
        return count; 
    }
}