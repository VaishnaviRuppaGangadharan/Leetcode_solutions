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
    public boolean isPalindrome(ListNode head) {
        List <Integer> array = new ArrayList<>();
        
        ListNode CurrentNode = head;
        int count=0;
        while(CurrentNode!=null){
            array.add(CurrentNode.val);
            CurrentNode = CurrentNode.next; 
            count++;
            }
        int n = count - 1;
        for(int i=0; i<n; i++){
            if(!array.get(i).equals(array.get(n))){
                return false;
            }
            else{
                n--;
            }
        }
        return true;
        
        
    }
}