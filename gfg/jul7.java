zclass Solution {
    ArrayList<Integer> l = new ArrayList<>();

    public ArrayList<Integer> Ancestors(Node root, int target) 
    {
        ances(root,target);
        return l;
        
    }
    
    public boolean ances(Node root,int target)
    {
        if (root == null)
            return false;
 
        if (root.data == target)
            return true;
 
        if (ances(root.left, target)
                || ances(root.right, target)) 
        {
            l.add(root.data);
            return true;
        }
 
        return false;
    }
    
}