class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i = 0 ; i<=nums.length-1;i++){
            ans[i] = nums[nums[i]];//nums[nums[i]]=>nums[nums[0]]=nums[0]=0; nums[nums[1]]=nums[2]=1 like the loop iterates 
        }
        return ans ;
    }
}