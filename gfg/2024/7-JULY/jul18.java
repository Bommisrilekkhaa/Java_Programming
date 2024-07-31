class Solution {
    int solve(int[] arr, boolean flag, int prev){
        int cnt = 1;
        for(int it : arr) {
            if(flag){
                if(prev < it){
                    cnt++;
                    flag = !flag;
                }
                prev = it;
            }
            else{
                if(prev > it){
                    cnt++;
                    flag = !flag;
                }
                prev = it;
            }
        }
        return cnt;
    }
  public int alternatingMaxLength(int[] arr) {
        return Math.max(solve(arr,false,Integer.MIN_VALUE),solve(arr,true,Integer.MAX_VALUE));
    }
}
