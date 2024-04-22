class Solution {
    public int openLock(String[] deadends, String target) {
        
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        visited.add("0000");
        int depth = 0;

        while (!queue.isEmpty()) 
        {
            int size = queue.size();
            for (int i = 0; i < size; i++) 
            {
                String current = queue.poll();
                if (deadSet.contains(current))
                    continue;
                if (current.equals(target))
                    return depth;
                for (int j = 0; j < 4; j++) 
                {
                    for (int d = -1; d <= 1; d += 2) 
                    {
                        int digit = (current.charAt(j) - '0' + d + 10) % 10;
                        String next = current.substring(0, j) + (char) (digit + '0') + current.substring(j + 1);
                        if (!visited.contains(next)) 
                        {
                            visited.add(next);
                            queue.offer(next);
                        }
                    }
                }
            }
            depth++;
        }

        return -1;
    }
}