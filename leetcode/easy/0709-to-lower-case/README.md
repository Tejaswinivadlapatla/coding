# To Lower Case

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, return  *the string after replacing every uppercase letter with the same lowercase letter*.

 

 **Example 1:** 

```
Input: s = "Hello"
Output: "hello"

```

 **Example 2:** 

```
Input: s = "here"
Output: "here"

```

 **Example 3:** 

```
Input: s = "LOVELY"
Output: "lovely"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of printable ASCII characters.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.7 MB (beats 84.32%)  
**Submitted:** 2026-08-20T17:20:39.718Z  

```java
class Solution {
    public String toLowerCase(String s) {
        s = s.toLowerCase();//convert to lower case 
        return s;//return the string
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/to-lower-case/)