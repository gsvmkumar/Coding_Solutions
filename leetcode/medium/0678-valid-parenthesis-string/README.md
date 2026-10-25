# Valid Parenthesis String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` containing only three types of characters: `'('`, `')'` and `' *'`, return `true`* if *`s`* is  **valid** *.

The following rules define a  **valid**  string:

- Any left parenthesis '(' must have a corresponding right parenthesis ')'.
- Any right parenthesis ')' must have a corresponding left parenthesis '('.
- Left parenthesis '(' must go before the corresponding right parenthesis ')'.
- '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

 

 **Example 1:** 

```
Input: s = "()"
Output: true

```

 **Example 2:** 

```
Input: s = "(*)"
Output: true

```

 **Example 3:** 

```
Input: s = "(*))"
Output: true

```

 **Example 4:** 

```
Input: s = "("
Output: false

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s[i] is '(', ')' or '*'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.3 MB (beats 96.36%)  
**Submitted:** 2026-10-25T17:21:39.774Z  

```java
class Solution {
    public boolean checkValidString(String s) {
        int mask = 1;
        for (char ch : s.toCharArray()) {
            if (ch == '(') 
                mask = mask << 1;
            else if (ch == ')') 
                mask = mask >> 1;
            else 
                mask = (mask << 1) | mask | (mask >> 1);
            if (mask == 0)
                return false;   
        }
        return (mask & 1) != 0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-parenthesis-string/)