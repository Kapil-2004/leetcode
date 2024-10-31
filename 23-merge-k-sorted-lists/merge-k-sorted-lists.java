/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for(ListNode nn : lists){
            if(nn!=null){
                heap.add(nn);
            }
        }

        ListNode head = new ListNode(0);
        ListNode curr = head;

        while(!heap.isEmpty()){
            ListNode node = heap.poll();
            curr.next = node;
            curr = curr.next;

            if (node.next != null) {
                heap.add(node.next);
            }
        }

        return head.next;
    }
}