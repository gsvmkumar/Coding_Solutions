# LJAAS79 - Rating 680

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Vowel or Consonant

Create a program that takes a lowercase English alphabetic character as input and uses a  **switch**  statement to determine if it's a  **vowel**  or  **consonant**.

### Sample 1:
Input
Output

```
i
```

```
Vowel
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T16:09:49.324Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        switch(ch) {
            case 'a': 
                System.out.println("Vowel"); 
                break;
            case 'e': 
                System.out.println("Vowel"); 
                break;
            case 'i': 
                System.out.println("Vowel"); 
                break;
            case 'o': 
                System.out.println("Vowel"); 
                break;
            case 'u': 
                System.out.println("Vowel"); 
                break;
            default: 
                System.out.println("Consonant");
        }
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS79)