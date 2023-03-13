# 2520. Count the Digits That Divide a Number

Given an integer 'num', return the number of digits in 'num' that divide 'num'.

An integer 'val' divides 'nums' if 'nums % val == 0'.

<strong>Example 1:</strong>
```
Input: num = 7
Output: 1
Explanation: 7 divides itself, hence the answer is 1.
```

<strong>Example 2:</strong>
```
Input: num = 121
Output: 2
Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
```

<strong>Example 3:</strong>
```
Input: num = 1248
Output: 4
Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
```

<strong>Constraints:</strong>

- '1 <= num <= 10^9'
- 'num' does not contain '0' as one of its digits.
