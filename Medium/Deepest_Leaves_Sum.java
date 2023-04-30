//1302. Deepest Leaves Sum

//https://leetcode.com/problems/deepest-leaves-sum/

//My-Submission: https://leetcode.com/problems/deepest-leaves-sum/solutions/3470304/easy-java-solution/

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
    public int deepestLeavesSum(TreeNode root) {
        int temp =  findDeepLevel(root);
        return deepAdder(root, temp, 1, 0);
    }
    static int findDeepLevel(TreeNode root){
        if(root==null){
            return 0;
        }
        int a = findDeepLevel(root.left);
        int b = findDeepLevel(root.right);
        return (Math.max(a,b)+1);
    }
    static int deepAdder(TreeNode root, int temp, int curlvl, int sum){
        if(root==null){
            return 0;
        }
        if(curlvl==temp){
            sum += root.val;
            return sum;
        }
        int a = deepAdder(root.left, temp, curlvl+1, sum);
        int b = deepAdder(root.right, temp, curlvl+1, sum);
        return a+b;
    }
}