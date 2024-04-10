class Solution 
{
    public int leastInterval(char[] tasks, int n) 
    {
        int []map = new int[26];
        for(char c : tasks)
            map[c- 'A']++;
        
        Arrays.sort(map);
        int count = map[25];
        int vacant = --count * n;
        for(int i = 0; i < 25; i++){
            vacant -= Math.min(map[i], count); 
        }
        return vacant > 0 ? tasks.length + vacant : tasks.length;
    }
}