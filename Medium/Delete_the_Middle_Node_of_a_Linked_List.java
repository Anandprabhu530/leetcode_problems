//2095. Delete the Middle Node of a Linked List

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

//My-Submission: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/solutions/3464322/easy-to-understand-java-solution/

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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            ListNode ans1 = null;
            return ans1;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        while(temp.next!=null){
            if(temp.next==slow){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}