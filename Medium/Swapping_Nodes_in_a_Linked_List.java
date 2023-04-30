//1721. Swapping Nodes in a Linked List

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

//My-Solution: https://leetcode.com/problems/swapping-nodes-in-a-linked-list/solutions/3469133/easy-java-solution/

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode prev = head;
        int count = 0;
        while(prev!=null){
            count++;
            prev = prev.next;
        }
        ListNode temp = head;
        for(int i=0;i<k-1;i++){
            temp = temp.next;
        }
        ListNode temp2 = head;
        for(int i=0;i<count-k;i++){
            temp2 = temp2.next;
        }
        int valu = temp.val;
        temp.val = temp2.val;
        temp2.val = valu;
        return head;
    }
}
