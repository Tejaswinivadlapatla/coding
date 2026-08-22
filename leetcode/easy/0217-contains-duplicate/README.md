# Contains Duplicate

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return `true` if any value appears  **at least twice**  in the array, and return `false` if every element is distinct.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,1]

 **Output:**  true

 **Explanation:** 

The element 1 occurs at the indices 0 and 3.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  false

 **Explanation:** 

All elements are distinct.

 **Example 3:** 

 **Input:**  nums = [1,1,1,3,3,4,3,2,4,2]

 **Output:**  true

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 40 ms (beats 5.10%)  
**Memory:** 102.3 MB (beats 70.27%)  
**Submitted:** 2026-08-22T04:44:36.929Z  

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){//iterating every element in the loop
            if(map.containsKey(nums[i])){//checking weather the hashmap was having the element of not if element was already exits it executes the if or it executes the else statement
                map.put(nums[i],map.get(nums[i])+1);
                //keeping element of array in hashmap ,  element was already present so map.get we will get the value of element then we will add1 to that value if 1 -> 1 then by ading +1 we will get 1 -> 2
            }
            else{
                map.put(nums[i],1);//if element was not present we will directly add element to it
            }
        }
        for(int values :map.values()){//iterating for loop for all values in hashmap we are not using index beacuse A HashMap doesn't have indexes like an array
            if(values>1){
                return true;
            }
        }
        return false;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/contains-duplicate/)