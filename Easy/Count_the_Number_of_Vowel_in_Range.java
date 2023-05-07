//2586. Count the Number of Vowel Strings in Range

//https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/description/

//My-Submission: https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/solutions/3496384/easy-java-solution/

//WITH SET
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i=left;i<=right;i++){
            char ch_start = words[i].charAt(0);
            char ch_end = words[i].charAt(words[i].length()-1);
            if(set.contains(ch_start) && set.contains(ch_end)){
                count++;
            }
        }
        return count;
    }
}

//WITHOUT SET
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            char ch_start = words[i].charAt(0);
            char ch_end = words[i].charAt(words[i].length()-1);
            if((ch_start=='a' || ch_start=='e' || ch_start=='i' || ch_start=='o' || ch_start=='u')&&(ch_end=='a' || ch_end=='e' || ch_end=='i' || ch_end=='o' || ch_end=='u')){
                count++;
            }
        }
        return count;
    }
}