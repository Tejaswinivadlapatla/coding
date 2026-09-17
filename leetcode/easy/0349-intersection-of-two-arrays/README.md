# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 97.64%)  
**Memory:** 45.1 MB (beats 25.65%)  
**Submitted:** 2026-09-17T04:22:46.439Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)