# 2535. Difference Between Element Sum and Digit Sum of an Array

You are given a positive integer array `nums`.

- The <strong>element sum</strong> is the sum of all the elements in `nums`.
- The <strong>digit sum</strong> is the sum of all the digits (not necessarily distinct) that appear in `nums`.

Return the <strong><em>absolute</em></strong> difference between the <strong><em>element sum</em></strong> and <strong><em>digit sum</em></strong> of `nums`.

Note that the absolute difference between two integers `x` and `y` is defined as `|x - y|`.

<strong>Example 1:</strong>
```
Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
```

<strong>Example 2:</strong>
```
Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
```

<strong>Constraints:</strong>

- `1 <= nums.length <= 2000`
- `-2000 <= nums[i] <= 2000`
