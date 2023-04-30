//2265. Count Nodes Equal to Average of Subtree

//https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/

//My-Submission: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/solutions/3470287/easy-java-solution/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int total = 0;
    public int averageOfSubtree(TreeNode root) {
        return calculator(root);
    }
    public int calculator(TreeNode root){
        if(root==null){
            return 0;
        }
        int count = nodescalculator(root);
        int subtotal = nodessum(root);
        if(subtotal/count == root.val){
            total++;
        }
        calculator(root.left);
        calculator(root.right);
        return total; 
    }
    public int nodessum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum = nodessum(root.left);
        int rightsum = nodessum(root.right);

        return (leftsum + rightsum + root.val);
    }
    public int nodescalculator(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = nodescalculator(root.left);
        int right = nodescalculator(root.right);

        return (left+right+1);
    }
}
