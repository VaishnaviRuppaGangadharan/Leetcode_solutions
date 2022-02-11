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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currentNode = head;
        for(int i=0; i<n; i++){
            currentNode = currentNode.next;
        }
        if(currentNode==null){
            return head.next;
        }
        ListNode nodeBefore = head;
        while(currentNode.next!=null){
            currentNode = currentNode.next;
            nodeBefore = nodeBefore.next;
        }
        nodeBefore.next = nodeBefore.next.next;
        return head;
        
    }
}