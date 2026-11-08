# Symmetric Tree

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `root` of a binary tree,  *check whether it is a mirror of itself*  (i.e., symmetric around its center).

 

 **Example 1:** 

```
Input: root = [1,2,2,3,4,4,3]
Output: true

```

 **Example 2:** 

```
Input: root = [1,2,2,null,3,null,3]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the tree is in the range [1, 1000].
- -100 <= Node.val <= 100

 

 **Follow up:**  Could you solve it both recursively and iteratively?

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 9.69%)  
**Memory:** 43.2 MB (beats 75.16%)  
**Submitted:** 2026-11-08T17:45:05.448Z  

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
    if(root==null)  return true;
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode left, right;
    if(root.left!=null){
        if(root.right==null) return false;
        stack.push(root.left);
        stack.push(root.right);
    }
    else if(root.right!=null){
        return false;
    }
        
    while(!stack.empty()){
        if(stack.size()%2!=0)   return false;
        right = stack.pop();
        left = stack.pop();
        if(right.val!=left.val) return false;
        
        if(left.left!=null){
            if(right.right==null)   return false;
            stack.push(left.left);
            stack.push(right.right);
        }
        else if(right.right!=null){
            return false;
        }
            
        if(left.right!=null){
            if(right.left==null)   return false;
            stack.push(left.right);
            stack.push(right.left);
        }
        else if(right.left!=null){
            return false;
        }
    }
    
    return true;
}
}
```

---

[View on LeetCode](https://leetcode.com/problems/symmetric-tree/)