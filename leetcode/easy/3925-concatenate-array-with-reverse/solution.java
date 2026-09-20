class Solution {
    public int[] concatWithReverse(int[] nums) {
        int result[] = new int[2*(nums.length)];
        int n = nums.length;
        for(int i=0 ;i<=nums.length-1 ; i++){
            result[i] = nums[i];
        }
        for(int i=0 ;i<=nums.length-1 ; i++){
            result[n+i] = nums[n-1-i];
        }
        return result;
    }
}