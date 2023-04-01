//21. Merge Two Sorted Lists

//https://leetcode.com/problems/merge-two-sorted-lists/description/

//My-Submission: https://leetcode.com/problems/merge-two-sorted-lists/solutions/3365241/easy-to-understand-java-solution/

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode ans = temp;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                ListNode node = new ListNode(list1.val);
                temp.next = node;
                temp = temp.next;
                list1 = list1.next;
            }else{
                ListNode node = new ListNode(list2.val);
                temp.next = node;
                temp = temp.next;
                list2 = list2.next;
            }
        }
        while(list1!=null){
            ListNode node = new ListNode(list1.val);
            temp.next = node;
            temp = temp.next;
            list1 = list1.next;
        }
        while(list2!=null){
            ListNode node = new ListNode(list2.val);
            temp.next = node;
            temp = temp.next;
            list2 = list2.next;
        }
        return ans.next;
    }
}