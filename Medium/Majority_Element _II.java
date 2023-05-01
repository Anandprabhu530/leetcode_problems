//229. Majority Element II

//https://leetcode.com/problems/majority-element-ii/description/

//My-Submission: https://leetcode.com/problems/majority-element-ii/solutions/3474524/easy-java-solution-with-hashmap/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key)>nums.length/3){
                list.add(key);
            }
        }
        return list;
    }
}