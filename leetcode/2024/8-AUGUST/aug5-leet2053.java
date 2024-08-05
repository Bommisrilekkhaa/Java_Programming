class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> l = new ArrayList<>();
        ArrayList<String> ls = new ArrayList<>();

        for (String i : arr) {
            if (!l.contains(i) && !ls.contains(i))
                l.add(i);
            else {
                ls.add(i);
                l.remove(i);
            }
        }
        System.out.print(l);
        return (k > (l.size())) ? "" : l.get(k - 1);
    }
}
