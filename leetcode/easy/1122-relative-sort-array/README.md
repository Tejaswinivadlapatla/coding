# Relative Sort Array

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two arrays `arr1` and `arr2`, the elements of `arr2` are distinct, and all elements in `arr2` are also in `arr1`.

Sort the elements of `arr1` such that the relative ordering of items in `arr1` are the same as in `arr2`. Elements that do not appear in `arr2` should be placed at the end of `arr1` in  **ascending**  order.

 

 **Example 1:** 

```
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

```

 **Example 2:** 

```
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]

```

 

 **Constraints:** 

- 1 <= arr1.length, arr2.length <= 1000
- 0 <= arr1[i], arr2[i] <= 1000
- All the elements of arr2 are distinct.
- Each arr2[i] is in arr1.

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 51.07%)  
**Memory:** 43.9 MB (beats 41.87%)  
**Submitted:** 2026-09-16T12:27:49.127Z  

```java
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Count how many times each number occurs
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++) {
            if(map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            }
            else {
                map.put(arr1[i], 1);
            }
        }

        int[] ans = new int[arr1.length];
        int k = 0;

        // Put arr2 values first
        for(int i = 0; i < arr2.length; i++) {

            int value = arr2[i];
            int count = map.get(value);

            for(int j = 0; j < count; j++) {
                ans[k] = value;
                k++;
            }

            map.remove(value);
        }

        // Put remaining values in ascending order
        ArrayList<Integer> remaining =
            new ArrayList<>(map.keySet());

        Collections.sort(remaining);

        for(int i = 0; i < remaining.size(); i++) {

            int value = remaining.get(i);
            int count = map.get(value);

            for(int j = 0; j < count; j++) {
                ans[k] = value;
                k++;
            }
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/relative-sort-array/)