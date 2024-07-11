class Solution {
    int i = 0;
    public String reverseParentheses(String s) {
        char[] ar = s.toCharArray();
        return rev(ar);
    }

    public String rev(char[] s){
        StringBuilder sb = new StringBuilder();

        while(i < s.length){
            if(s[i] == ')'){
                i++;
                return sb.reverse().toString();
            }else if(s[i] == '('){
                i++;
                String st  = rev(s);
                sb.append(st);
            }else{
                sb.append(s[i]);
                i++;
            }
        }
        return sb.toString();

    }
}