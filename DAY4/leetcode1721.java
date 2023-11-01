class Solution {
    public ListNode swapNodes(ListNode head, int k) {
         ListNode start, end, curr;
        start=head;
        for(int i=1;i<k;i++) 
            start=start.next;
        
        curr=start;
        end=head; 
        while(curr.next!=null){ 
            curr=curr.next;
            end=end.next; 
        }
        
        int temp= start.val;
        start.val=end.val;
        end.val=temp;

        return head;
    }
}