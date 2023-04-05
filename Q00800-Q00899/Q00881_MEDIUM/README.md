# 881. Boats to Save People

You are given an array `people` where `people[i]` is the weight of the `ith` person, and an <strong>infinite number of boats</strong> where each boat can carry a maximum weight of `limit`. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most `limit`.

Return <em>the minimum number of boats to carry every given person</em>.

<strong>Example 1:</strong>
```
Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
```

<strong>Example 2:</strong>
```
Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
```

<strong>Example 3:</strong>
```
Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
```


<strong>Constraints:</strong>

- `1 <= people.length <= 5 * 10^4`
- `-2000 <= people[i] <= limit <= 3 * 10^4
