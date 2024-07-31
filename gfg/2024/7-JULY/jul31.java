class Solution {
    
    public String longestCommonPrefix(String arr[]) {
        
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        int n = Math.min(first.length(),last.length());
        int i;
        for(i = 0; i<n ; i++) {
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }    
        }
        if(i==0)    return "-1";
        return arr[0].substring(0,i);
    }
}
