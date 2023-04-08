//51. N-Queens

//https://leetcode.com/problems/n-queens/description/

//My_Submission: https://leetcode.com/problems/n-queens/solutions/3393951/easy-to-understand-java-solution/

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        boolean[][] check = new boolean[n][n];
        Queen_Placeable(check, 0, ans);
        return ans;
    }
    void Queen_Placeable(boolean[][] check, int row, List<List<String>> ans1){
        if(row==check.length){
            ArrayList<String> subans1 = display(check);
            ans1.add(subans1);
            return;
        }
        for(int i=0;i<check.length;i++){
            if(placed(check, row, i)){
                check[row][i] = true;
                Queen_Placeable(check, row+1, ans1);
                check[row][i] = false;
            }
        }
        return;
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
    ArrayList<String> display(boolean[][] check){
        ArrayList<String> inner=new ArrayList<>();
	    for(boolean[] row:check){
            String s="";
	        for(boolean ele:row){
	            if(ele){
	                s+="Q";
	            }
	            else{
	                s+=".";
	            }
	        }
	        inner.add(s);
	    }
        return inner;
    }
}