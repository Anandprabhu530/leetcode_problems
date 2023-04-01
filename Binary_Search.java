//704. Binary Search

//https://leetcode.com/problems/binary-search/description/

//My-Submission: https://leetcode.com/problems/binary-search/solutions/3364843/easy-java-solution-with-explanation/

class Solution {
    public int search(int[] nums, int target) {
        if(target>nums[nums.length-1] || target<nums[0]){
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end = mid - 1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}