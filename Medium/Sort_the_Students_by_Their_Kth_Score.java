//2545. Sort the Students by Their Kth Score

//https://leetcode.com/problems/sort-the-students-by-their-kth-score/description/

//My-Solution: https://leetcode.com/problems/sort-the-students-by-their-kth-score/solutions/3757569/easy-java-solution-brute-force/

class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length;i++){
            int max = score[i][k];
            int index = i;
            for(int j=i+1;j<score.length;j++){
                if(max<score[j][k]){
                    max = score[j][k];
                    index = j;
                }
            }
            for(int j=0;j<score[i].length;j++){
                int temp = score[index][j];
                score[index][j] = score[i][j];
                score[i][j] = temp;
            }
        }
        return score;
    }
}