//2640. Find the Score of All Prefixes of an Array

//https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/

//My-Submission: https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/solutions/3423263/easy-to-understand-java-solution/

class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] arr = new long[nums.length];
        long[] max = new long[nums.length];
        long max_sub = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max_sub){
                max_sub = nums[i];
            }
            max[i] = max_sub;
        }
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            max[i] = nums[i] + max[i];
            sum += max[i];
            arr[i] = sum;
        }
        return arr;
    }
}