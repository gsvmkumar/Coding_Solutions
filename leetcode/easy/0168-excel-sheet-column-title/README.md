# Excel Sheet Column Title

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `columnNumber`, return  *its corresponding column title as it appears in an Excel sheet*.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

```

 

 **Example 1:** 

```
Input: columnNumber = 1
Output: "A"

```

 **Example 2:** 

```
Input: columnNumber = 28
Output: "AB"

```

 **Example 3:** 

```
Input: columnNumber = 701
Output: "ZY"

```

 

 **Constraints:** 

- 1 <= columnNumber <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.7 MB (beats 99.35%)  
**Submitted:** 2026-10-18T11:52:46.937Z  

```java
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/excel-sheet-column-title/)