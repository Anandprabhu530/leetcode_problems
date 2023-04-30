//19. Remove Nth Node From End of List

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

//My-Submission: https://leetcode.com/problems/remove-nth-node-from-end-of-list/solutions/3468651/easy-java-solution/

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
        if(head==null || head.next==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            head = head.next;
            return head;
        }
        while(fast!=null && fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}