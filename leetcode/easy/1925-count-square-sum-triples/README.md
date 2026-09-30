# Count Square Sum Triples

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A  **square triple**  `(a,b,c)` is a triple where `a`, `b`, and `c` are  **integers**  and `a2 + b2 = c2`.

Given an integer `n`, return  *the number of  **square triples**  such that* `1 <= a, b, c <= n`.

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: The square triples are (3,4,5) and (4,3,5).

```

 **Example 2:** 

```
Input: n = 10
Output: 4
Explanation: The square triples are (3,4,5), (4,3,5), (6,8,10), and (8,6,10).

```

 

 **Constraints:** 

- 1 <= n <= 250

## Solution

**Language:** Java  
**Runtime:** 233 ms (beats 28.77%)  
**Memory:** 42.2 MB (beats 52.42%)  
**Submitted:** 2026-09-30T17:27:17.382Z  

```java
class Solution {
    public int countTriples(int n) {
        int count =0 ;
        for(int i=1 ;i<=n ;i++){
            for(int j=1;j<=n;j++){
                for(int k=1; k<=n ;k++){
                    if((i*i)+(j*j) == (k*k)){
                        count = count+1;
                    }
                }
            }
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-square-sum-triples/)