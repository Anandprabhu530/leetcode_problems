//92. Reverse Linked List II

//https://leetcode.com/problems/reverse-linked-list-ii/description/

//https://leetcode.com/problems/reverse-linked-list-ii/solutions/3466180/easy-to-understand-java-solution/

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        for(int i=0;curr!=null && i<left-1;i++){
            prev = curr;
            curr = curr.next;
        }
        ListNode last = prev;
        ListNode newend = curr;
        ListNode cmng = curr.next;
        for(int i=0;curr!=null && i<right-left+1;i++){
            curr.next = prev;
            prev = curr;
            curr = cmng;
            if(cmng!=null){
                cmng = cmng.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }
        newend.next = curr;
        return head;
    }
}