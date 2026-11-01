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
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newList = reverse(slow);
        int MaxSum = 0;
        while(newList!=null){
            MaxSum = Math.max(MaxSum, head.val + newList.val);
            head = head.next;
            newList = newList.next;
        }
        return MaxSum;
    }
    private ListNode reverse(ListNode head){
        ListNode curr= head,prev = null,next= null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}