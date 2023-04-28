//202. Happy Number

//https://leetcode.com/problems/happy-number/description/

//My-Submission: https://leetcode.com/problems/happy-number/solutions/3463951/easy-to-understand-java-solution/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
            slow = splitter(slow);
            fast = splitter(splitter(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }

    static int splitter(int n){
        int sum = 0;
        while(n>0){
            sum += ((n%10) * (n%10));
            n/=10;
        }
        return sum;
    }
}