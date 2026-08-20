# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 5.32%)  
**Memory:** 48 MB (beats 88.86%)  
**Submitted:** 2026-08-20T17:17:06.472Z  

```java
class Solution {
    public void reverseString(char[] s) {
        // by using two pointers approach
        int left = 0 ;
        int right = s.length-1;
        for(int i = 0;i<s.length-1;i++){
            while(left<right){// if it meets the midpoint it stops the poniter moving
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
            }
        }
        System.out.println(s);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)