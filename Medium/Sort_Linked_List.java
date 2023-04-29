//148. Sort List

//https://leetcode.com/problems/sort-list/description/

//My-Submission: https://leetcode.com/problems/sort-list/solutions/3465681/easy-to-understand-java-solution/

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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = mid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return Joiner(left,right);

    }
    static ListNode Joiner(ListNode list1, ListNode list2){
        ListNode ans = new ListNode(); 
        ListNode temp = ans;
        while(list1!=null && list2!=null){
            if(list1.val>=list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
                 temp = temp.next;
            }
            
        }
        temp.next = (list1!=null)?list1:list2;
        return ans.next;
    }
    static ListNode mid(ListNode head){
        ListNode slow = null;
        while(head!=null && head.next!=null){
            slow = (slow==null) ? head: slow.next;
            head = head.next.next;
        }
        ListNode ans = slow.next;
        slow.next = null;
        return ans;
    }
}