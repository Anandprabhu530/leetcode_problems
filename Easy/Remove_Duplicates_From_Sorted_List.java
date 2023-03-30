//83. Remove Duplicates from Sorted List

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

//My-Submission: https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/3360424/easy-to-understand-java-solution/

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(head==null){
            return head;
        }
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next = head.next.next;
            }else
            head = head.next;
        }
        return temp;
    }
}