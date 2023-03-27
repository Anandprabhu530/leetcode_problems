//367. Valid Perfect Square
//https://leetcode.com/problems/valid-perfect-square/description/

//My-Submission - https://leetcode.com/problems/valid-perfect-square/solutions/3348310/java-binary-search-solution/
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int start = 1;
        int end = num;
        while(start<=end){
            long mid = start + (end - start)/2;
            if(mid*mid==num){
                return true;
            }
            if(mid*mid>num){
                end = (int)(mid - 1);
            }else{
                start = (int)(mid + 1);
            }
        }
        return false;
    }
}
