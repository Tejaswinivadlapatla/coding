# Design HashSet

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Design a HashSet without using any built-in hash table libraries.

Implement `MyHashSet` class:

- void add(key) Inserts the value key into the HashSet.
- bool contains(key) Returns whether the value key exists in the HashSet or not.
- void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.

 

 **Example 1:** 

```
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

 

 **Constraints:** 

- 0 <= key <= 106
- At most 104 calls will be made to add, remove, and contains.

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 65.41%)  
**Memory:** 53.9 MB (beats 33.60%)  
**Submitted:** 2026-08-06T16:44:41.113Z  

```java
class MyHashSet {
     boolean[] set;
    public MyHashSet() {
       
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        //insertd the value to HashSet stored in the set intially all the values arew false
        // if we add any element the value of thatwill become true
       set[key]=true;
    }
    
    public void remove(int key) {
        //it will remove the key it it exsit 
        // if the element was present then that value is true it we remove that element then that value becomes false 
        set[key] = false;

    }
    
    public boolean contains(int key) {
        //it contains key and tells us is the key contains or not 
        //if the elemnt was present then it will return true if not it will return the false 
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
```

---

[View on LeetCode](https://leetcode.com/problems/design-hashset/)