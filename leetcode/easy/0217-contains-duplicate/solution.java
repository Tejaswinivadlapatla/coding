class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;//will return true if we are having the element already in the set 
            }
            set.add(nums[i]);//adding nums to hashset
        }
        return false;
        
    }
}