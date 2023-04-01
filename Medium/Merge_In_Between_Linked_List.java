//1669. Merge In Between Linked Lists

//https://leetcode.com/problems/merge-in-between-linked-lists/description/

//My-Submission: https://leetcode.com/problems/merge-in-between-linked-lists/solutions/3365418/easy-to-understand-java-solution/

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = new ListNode();
        ListNode ans = temp;
        boolean check = false;
        int c = 0;
        while(list1!=null){
            if(c==a){
                check = true;
            }
            if(check){
                while(list2!=null){
                    ListNode node = new ListNode(list2.val);
                    temp.next = node;
                    temp = temp.next;
                    list2 = list2.next;
                }
            }else{
                ListNode node = new ListNode(list1.val);
                temp.next = node;
                temp = temp.next;
            }
            if(c==b){
                check = false;
            }
            list1 = list1.next;
            c++;
        }
        return ans.next;
    }
}