# Move Zeroes

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, move all `0`'s to the end of it while maintaining the relative order of the non-zero elements.

 **Note**  that you must do this in-place without making a copy of the array.

 

 **Example 1:** 

```
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

```

 **Example 2:** 

```
Input: nums = [0]
Output: [0]

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Could you minimize the total number of operations done?

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 9.69%)  
**Memory:** 47.9 MB (beats 20.72%)  
**Submitted:** 2026-08-05T16:17:20.788Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/move-zeroes/)