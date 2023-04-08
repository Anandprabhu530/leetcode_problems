//52. N-Queens II

//https://leetcode.com/problems/n-queens-ii/

//My_Submission: https://leetcode.com/problems/n-queens-ii/solutions/3393959/easy-to-understand-java-solution/

class Solution {
    public int totalNQueens(int n) {
        boolean[][] check = new boolean[n][n];
        return(Queen_Placeable(check, 0));
    }
    int Queen_Placeable(boolean[][] check, int row){
        if(row==check.length){
            return 1;
        }
        int count = 0;
        for(int i=0;i<check.length;i++){
            if(placed(check, row, i)){
                check[row][i] = true;
                count += Queen_Placeable(check, row+1);
                check[row][i] = false;
            }
        }
        return count;
    }
    boolean placed(boolean[][] check, int row, int col){
        for(int i=0;i<row;i++){
            if(check[i][col]){
                return false;
            }
        }
        int left = Math.min(row,col);
        for(int i=1;i<=left;i++){
            if(check[row-i][col-i]){
                return false;
            }
        }
        int right = Math.min(row,check.length-col-1);
        for(int i=1;i<=right;i++){
            if(check[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}