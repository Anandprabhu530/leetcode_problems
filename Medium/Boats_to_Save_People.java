//881. Boats to Save People

//https://leetcode.com/problems/boats-to-save-people/

//My-Submission: https://leetcode.com/problems/boats-to-save-people/solutions/3496196/easy-java-solution/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int k = 0, start = 0, end = people.length-1;
        Arrays.sort(people);
        while(start<=end){
            if((people[start]+people[end]) <= limit){
                k++;
                start++;
                end--;
            }else{
                end--;
                k++;
            }
        }
        return k;
    }
}