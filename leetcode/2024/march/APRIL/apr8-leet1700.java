class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sq = 0,cir = 0;

        for (int s : students) 
        {
            if (s == 1) 
                cir++;
            else 
                sq++;
            
        }

        for (int s : sandwiches) 
        {
            if (s == 1 && cir > 0) 
                cir--;
            else if (s == 0 && sq > 0) 
                sq--;
            else 
                return cir + sq;
            
        }

        return 0;
    }
}