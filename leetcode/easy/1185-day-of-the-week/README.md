# Day of the Week

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the `day`, `month` and `year` respectively.

Return the answer as one of the following values `{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}`.

 **Note:**  January 1, 1971 was a Friday.

 

 **Example 1:** 

```
Input: day = 31, month = 8, year = 2019
Output: "Saturday"

```

 **Example 2:** 

```
Input: day = 18, month = 7, year = 1999
Output: "Sunday"

```

 **Example 3:** 

```
Input: day = 15, month = 8, year = 1993
Output: "Sunday"

```

 

 **Constraints:** 

- The given dates are valid dates between the years 1971 and 2100.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 24.52%)  
**Memory:** 42.8 MB (beats 16.18%)  
**Submitted:** 2026-09-19T02:58:12.801Z  

```java
import java.time.LocalDate;
// This allows us to use Java's LocalDate class.

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        //Create the date -> LocalDate.of(2019, 8, 31)
        LocalDate date = LocalDate.of(year, month, day);

        //Get the day of the week .toString() -> converts it into a String.
        String result = date.getDayOfWeek().toString();
        // result = "SATURDAY" but here case sensitive -> substring(start, end) takes part of a String.
        //Starting from index 1 until the end: "ATURDAY" -> .toLowerCase() -> "Saturday"
        return result.substring(0, 1) + result.substring(1).toLowerCase();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/day-of-the-week/)