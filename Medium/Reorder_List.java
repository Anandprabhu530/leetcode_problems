//143. Reorder List

//https://leetcode.com/problems/reorder-list/description/

//https://leetcode.com/problems/reorder-list/solutions/3467344/easy-java-solution/

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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid = FindMiddle(head);
        ListNode temp = Reverser(mid);
        ListNode curr = head;
        while(curr!=null && temp!=null){
            ListNode cmng = curr.next;
            curr.next = temp;
            curr = cmng;
            cmng = temp.next;
            temp.next = curr;
            temp = cmng;
        }
        if(curr!=null){
            curr.next = null;
        }
    }
    ListNode FindMiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }  
    ListNode Reverser(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode cmng = head.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = cmng;
            if(cmng!=null){
                cmng = cmng.next;
            }
        }
        return prev;
    }
}