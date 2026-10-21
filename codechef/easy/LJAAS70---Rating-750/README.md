# LJAAS70 - Rating 750

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Increase or Decrease

Write a program that takes three numbers as input and prints " **Increasing** " if the numbers are in strictly increasing order, " **Decreasing** " if they are in strictly decreasing order, and " **Neither** " otherwise.

### Sample 1:
Input
Output

```
20 30 41
```

```
Increasing
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T16:05:32.963Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a<b && b<c)
		    System.out.println("Increasing");
		else if(a>b && b>c)
		    System.out.println("Decreasing");
		else
		    System.out.println("Neither");
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS70)