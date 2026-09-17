class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // one hashset for storing all num1 values and ans for storing common values of the num1 and num2
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();

        // for loop stores the nums1 if any dupilacates of num1 it will ignore and stores only unique values 
        for(int i=0;i<=nums1.length-1 ;i++){
            set.add(nums1[i]);
        }

        // it returns the values of num1 if they present in the num2 it will return only the unique values 
        for(int i=0 ;i<=nums2.length-1 ; i++){
            if(set.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }
        // we cannot return the ans because it was the hashset so we will return the array of values of hashset 
        int result[] = new int[ans.size()];
        int i =0 ; // declaration of i
            for(int value : ans){// for loop for iterating all values of the ans hashset 
            result[i]=value;
            i++;
        }
        
        return result ;
        
    }
}