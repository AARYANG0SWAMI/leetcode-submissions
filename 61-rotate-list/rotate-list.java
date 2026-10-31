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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        ListNode tail = head;
        int size = 1;
        while(tail.next != null){
            tail = tail.next;
           size++;
        }
        k = k%size;
        if(k==0) return head;
        tail.next = head;
        int steps = size - k;
        while(steps>0){
            tail = tail.next;
            steps--;
        }
        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;
    }
}