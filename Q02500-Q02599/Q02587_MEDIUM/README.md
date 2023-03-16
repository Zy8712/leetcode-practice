# 2587. Rearrange Array to Maximize Prefix Score

You are given a <strong>0-indexed</strong> integer array `nums`. You can rearrange the elements of `nums` to <strong>any order</strong> (including the given order).

Let `prefix` be the array containing the prefix sums of `nums` after rearranging it. In other words, `prefix[i]` is the sum of the elements from `0` to `i` in `nums` after rearranging it. The <strong>score</strong> of `nums` is the number of positive integers in the array `prefix`.

Return <em>the maximum score you can achieve</em>.

<strong>Example 1:</strong>
```
<strong>Input:</strong> nums = [2,-1,0,1,-3,3,-3]
<strong>Output:</strong> 6
<strong>Explanation:</strong> We can rearrange the array into nums = [2,3,1,-1,-3,0,-3].
prefix = [2,5,6,5,2,2,-1], so the score is 6.
It can be shown that 6 is the maximum score we can obtain.
```

<strong>Example 2:</strong>
```
<strong>Input:</strong> nums = [-2,-3,0]
<strong>Output:</strong> 0
<strong>Explanation:</strong> Any rearrangement of the array will result in a score of 0.
```

<strong>Constraints:</strong>

- `1 <= nums.length <= 10^5`
- `-10^6 <= nums[i] <= 10^6`