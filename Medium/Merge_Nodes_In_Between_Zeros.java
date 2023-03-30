//2181. Merge Nodes in Between Zeros

//https://leetcode.com/problems/merge-nodes-in-between-zeros/description/

//My-Submission: https://leetcode.com/problems/merge-nodes-in-between-zeros/solutions/3360203/easy-to-understand-java-solution/


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
    public ListNode mergeNodes(ListNode head) {
        ListNode out = new ListNode();
        ListNode ans = out; 
        int count = 0;
        int local = 0;
        while(head!=null){
            if(head.val==0){
                count++;
            }else{
                local+=head.val;
            }
            if(count==2){
                ListNode node = new ListNode(local);
                out.next = node;
                out = out.next;
                local=0;
                count=1;
            }
            head=head.next;
        }
        return ans.next;
    }
}
