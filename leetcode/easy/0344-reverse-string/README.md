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
**Runtime:** 0 ms  
**Memory:** 42.8 MB  
**Submitted:** 2026-08-20T17:06:41.723Z  

```java
class Solution {
    public void reverseString(char[] s) {
        char[] arr = new char[s.length];
        int n =s.length-1;
        for (int i=0;i<s.length;i++){
            arr[i]=s[n-i];
            
        }
        //why again i wrote the for loop : leetcode does not check the arr it checks only the s so we changed it again 
        for (int j=0;j<s.length;j++){
            s[j]=arr[j];            
        }
        System.out.println(s);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)