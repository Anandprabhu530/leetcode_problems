//1290. Convert Binary Number in a Linked List to Integer
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/

class Solution {
    public int getDecimalValue(ListNode head) {
        int out = 0;
        while(head!=null){
            out = out * 2;
            out = out + head.val;
            head = head.next;
        }
        return out;
    }
}