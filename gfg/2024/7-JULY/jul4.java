class Solution {
    HashMap<String, Integer> m;
    List<Node> result;
    
    public String inorder(Node node) 
    {
        if (node == null)
            return "";
    
        String str = "(";
        str += inorder(node.left);
        str += Integer.toString(node.data);
        str += inorder(node.right);
        str += ")";
    
        
        if (m.get(str) != null && m.get(str) == 1)
            result.add(node);
    
        if (m.containsKey(str))
            m.put(str, m.get(str) + 1);
        else
            m.put(str, 1);
        
        return str;
    }
    
    
    
    
    public List<Node> printAllDups(Node root) {
         m = new HashMap<>();
        result = new ArrayList<>();
        inorder(root);
        return result;
        
    }
}