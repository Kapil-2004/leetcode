class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;
        if( k == 0) return head;
        int n = length-k ;
        temp = head ;

        while(n>1){
            temp = temp.next;
            n--;
        }
        ListNode newhead = temp.next;
        temp.next = null;
        
        ListNode tail = newhead;
        while(tail.next != null){
           tail = tail.next;
        }
        tail.next = head;
        return newhead;

    }
}