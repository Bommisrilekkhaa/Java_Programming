class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(String.valueOf(ch));
        StringBuilder s = new StringBuilder();

        if(index!=-1)
        {
            s.append(word.substring(0,index+1));
            s.reverse();
            word = String.valueOf(s) + word.substring(index+1,word.length());
        }

        return word;
    }
}