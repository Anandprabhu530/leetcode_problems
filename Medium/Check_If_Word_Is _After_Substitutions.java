//1003. Check If Word Is Valid After Substitutions

//https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/description/

//My-Submission: https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/solutions/3496818/easy-java-solution/

class Solution {
    public boolean isValid(String s) {
        if(!s.endsWith("c") || !s.startsWith("a") || s.contains("ac")){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='b'){
                stack.push(ch);
            }else{
                if(stack.size()>1 && stack.pop()=='b' && stack.pop()=='a'){

                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}