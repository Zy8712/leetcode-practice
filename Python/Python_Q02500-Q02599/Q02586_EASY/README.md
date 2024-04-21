# 2586. Count the Number of Vowel Strings in Range

You are given a <strong>0-indexed</strong> array of string `words` and two integers `left` and `right`.

A string is called a <strong>vowel string</strong> if it starts with a vowel character and ends with a vowel character where vowel characters are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

<em>Return the number of vowel strings</em> `words[i]` <em>where</em> `i` <em>belongs to the inclusive range</em> `[left, right]`.

<strong>Example 1:</strong>
```
Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
```

<strong>Example 2:</strong>
```
Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation:
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.
```

<strong>Constraints:</strong>

- `1 <= words.length <= 1000`
- `1 <= words[i].length <= 10`
- `words[i]` consists of only lowercase English letters.
- `0 <= left <= right < words.length`