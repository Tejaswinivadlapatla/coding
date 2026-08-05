class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0 ;
        // here the left pointer was fixed , right pointer was traversing 
        for(int right=0;right<nums.length;right++){
            // in the array if the right was non zero then swap
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left]=nums[right];
                nums[right] = temp;
                // increment the left
                left++;
            }
        }
        System.out.print(nums);
    }
}