class Solution {
    public int passThePillow(int n, int time) {
        int c = time/(n-1);
        int r = time%(n-1);
        int ans = 0;
        if(c%2!=0){
            ans = n - r;
        }else{
            ans = r + 1;
        }
        return ans;
    }
}