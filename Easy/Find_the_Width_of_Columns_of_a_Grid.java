//2639. Find the Width of Columns of a Grid

//https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/description/

//My-Submission: https://leetcode.com/problems/find-the-width-of-columns-of-a-grid/submissions/934668003/

class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int [] arr = new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                arr[i] = Math.max(String.valueOf(grid[j][i]).length(),arr[i]);
            }
        }
        return arr;
    }
}