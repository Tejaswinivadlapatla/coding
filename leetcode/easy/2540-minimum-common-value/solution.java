class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i<=nums1.length-1;i++){
            set.add(nums1[i]);
        }
        
        for(int i=0 ;i<=nums2.length-1;i++){
            if(set.contains(nums2[i])){
                return nums2[i];
            }
        }
        
        return -1;
    }
}