class Solution {
    public Node removeAllDuplicates(Node head) {
        Node temp,t=head;
        temp = new Node(0);
        
        // System.out.println(arr);
      
        
        temp.next=head;
        Node prev=temp;
        while(t!=null)
        {
            while(t.next!=null && prev.next.data == t.next.data)
                t=t.next;
                
            if(prev.next== t)
                prev = prev.next;
            else
                prev.next = t.next;
                
            t=t.next;
            
        }
        return temp.next;
        
    }