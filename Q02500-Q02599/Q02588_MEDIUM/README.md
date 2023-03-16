# 2588. Count the Number of Beautiful Subarrays

You are given a <strong>0-indexed</strong> integer array `nums`. In one operation, you can:

- Choose two different indices `i` and `j` such that `0 <= i, j < nums.length`.
- Choose a non-negative integer `k` such that the `kth` bit (<strong>0-indexed</strong>) in the binary representation of `nums[i]` and `nums[j]` is `1`.
- Subtract `2^k` from `nums[i]` and `nums[j]`.

A subarray is <strong>beautiful</strong> if it is possible to make all of its elements equal to `0` after applying the above operation any number of times.

Return the number of <strong>beautiful subarrays</strong> in the array `nums`.

A subarray is a contiguous <strong>non-empty</strong> sequence of elements within an array.

<strong>Example 1:</strong>
```
<strong>Input:</strong> nums = [4,3,1,2,4]
<strong>Output:</strong> 2
<strong>Explanation:</strong> There are 2 beautiful subarrays in nums: [4,3,1,2,4] and [4,3,1,2,4].
- We can make all elements in the subarray [3,1,2] equal to 0 in the following way:
  - Choose [3, 1, 2] and k = 1. Subtract 21 from both numbers. The subarray becomes [1, 1, 0].
  - Choose [1, 1, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 0, 0].
- We can make all elements in the subarray [4,3,1,2,4] equal to 0 in the following way:
  - Choose [4, 3, 1, 2, 4] and k = 2. Subtract 22 from both numbers. The subarray becomes [0, 3, 1, 2, 0].
  - Choose [0, 3, 1, 2, 0] and k = 0. Subtract 20 from both numbers. The subarray becomes [0, 2, 0, 2, 0].
  - Choose [0, 2, 0, 2, 0] and k = 1. Subtract 21 from both numbers. The subarray becomes [0, 0, 0, 0, 0].
```

<strong>Example 2:</strong>
```
<strong>Input:</strong> nums = [1,10,4]
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no beautiful subarrays in nums.
```

<strong>Constraints:</strong>

- `1 <= nums.length <= 10^5`
- `0 <= nums[i] <= 10^6`