//206. Reverse Linked List

//https://leetcode.com/problems/reverse-linked-list/description/

//My-Submission: https://leetcode.com/problems/reverse-linked-list/solutions/3465833/easy-to-understand-java-solution/

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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode cmg = head.next;
        while(cur!=null){
            cur.next = prev;
            prev = cur;
            cur = cmg;
            if(cmg!=null){
                cmg = cmg.next;
            }
        }
        return prev;
    }
}