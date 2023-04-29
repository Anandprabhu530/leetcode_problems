//234. Palindrome Linked List

//https://leetcode.com/problems/palindrome-linked-list/description/

//https://leetcode.com/problems/palindrome-linked-list/solutions/3466588/easy-to-understand-java-solution/

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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = MiddleElement(head);
        ListNode ans = reverse(temp);
        while(head!=null && ans!=null){
            if(head.val!=ans.val){
                break;
            }else{
                head = head.next;
                ans = ans.next;
            }
        }
        if(head==null || ans == null){
            return true;
        }
        return false;
    }
    ListNode reverse(ListNode head){
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
    ListNode MiddleElement(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}