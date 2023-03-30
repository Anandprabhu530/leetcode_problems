//237. Delete Node in a Linked List

//https://leetcode.com/problems/delete-node-in-a-linked-list/description/

//My_Submission: https://leetcode.com/problems/delete-node-in-a-linked-list/solutions/3360265/easy-to-understand-java-solution/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
	    node.next = node.next.next;
        System.gc();
    }
}