# Pow(x, n)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Implement pow(x, n), which calculates `x` raised to the power `n` (i.e., `xn`).

 

 **Example 1:** 

```
Input: x = 2.00000, n = 10
Output: 1024.00000

```

 **Example 2:** 

```
Input: x = 2.10000, n = 3
Output: 9.26100

```

 **Example 3:** 

```
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

```

 

 **Constraints:** 

- -100.0 < x < 100.0
- -231 <= n <= 231-1
- n is an integer.
- Either x is not zero or n > 0.
- -104 <= xn <= 104

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 21.45%)  
**Memory:** 47.5 MB (beats 79.36%)  
**Submitted:** 2026-10-28T11:42:51.941Z  

```java
class Solution {

    public double myPow(double x, int n) {

        // long handles Integer.MIN_VALUE safely
        long N = Math.abs((long) n);

        double ans = recursion(x, N);

        // x^-n = 1 / x^n
        return n < 0 ? 1 / ans : ans;
    }

    public double recursion(double x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Reduce problem size by half
        double temp = recursion(x, n / 2);

        if (n % 2 == 0) {

            // x^n = x^(n/2) × x^(n/2)
            return temp * temp;

        } else {

            // x^n = x × x^(n/2) × x^(n/2)
            return x * temp * temp;
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/powx-n/)