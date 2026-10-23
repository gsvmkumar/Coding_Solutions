# Insert Interval

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array of non-overlapping intervals `intervals` where `intervals[i] = [starti, endi]` represent the start and the end of the `ith` interval and `intervals` is sorted in ascending order by `starti`. You are also given an interval `newInterval = [start, end]` that represents the start and end of another interval.

Two intervals are considered overlapping if they share  **at least**  one point.

Insert `newInterval` into `intervals` such that `intervals` is still sorted in ascending order by `starti` and `intervals` still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return `intervals` *after the insertion*.

 **Note**  that you don't need to modify `intervals` in-place. You can make a new array and return it.

 

 **Example 1:** 

```
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

```

 **Example 2:** 

```
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].

```

 

 **Constraints:** 

- 0 <= intervals.length <= 104
- intervals[i].length == 2
- 0 <= starti <= endi <= 105
- intervals is sorted by starti in ascending order.
- newInterval.length == 2
- 0 <= start <= end <= 105

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 13.47%)  
**Memory:** 46.5 MB (beats 94.98%)  
**Submitted:** 2026-10-23T11:23:31.833Z  

```java
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> a=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++)
            a.add(intervals[i]);
        a.add(newInterval);
        Collections.sort(a, (x,y)->Integer.compare(x[0],y[0]));
        
        List<int[]> merged=new ArrayList<>();
        
        for(int i=0;i<a.size();i++){
            int []curr=a.get(i);
            n=merged.size();
            if(merged.isEmpty() || merged.get(n-1)[1]<curr[0] )
                merged.add(curr);
            else
                merged.get(n-1)[1]=Math.max(merged.get(n-1)[1],curr[1]);
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/insert-interval/)