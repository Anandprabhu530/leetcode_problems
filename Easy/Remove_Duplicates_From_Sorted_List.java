//83. Remove Duplicates from Sorted List

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

//My-Submission: https://leetcode.com/problems/remove-duplicates-from-sorted-list/solutions/3463515/easy-to-understand-java-solution/

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
        if(head==null || head.next==null){
            return head;
        }
        ListNode node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
