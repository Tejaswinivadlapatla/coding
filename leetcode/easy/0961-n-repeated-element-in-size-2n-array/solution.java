class Solution {
    public int repeatedNTimes(int[] nums) {
        int result = 0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<=nums.length-1;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                result = nums[i];
            }
        }
       return result; 
    }
}