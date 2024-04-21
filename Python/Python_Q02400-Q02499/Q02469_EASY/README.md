# 2469. Convert the Temperature

You are given a non-negative floating point number rounded to two decimal places `celsius`, that denotes the <strong>temperature in Celsius</strong>.

You should convert Celsius into <strong>Kelvin and Fahrenheit</strong> and return it as an array `ans = [kelvin, fahrenheit]`.

Return the array `ans`. Answers within `10^-5` of the actual answer will be accepted.

Note that:

- `Kelvin = Celsius + 273.15`
- `Fahrenheit = Celsius * 1.80 + 32.00`
 

<strong>Example 1:</strong>
```
Input: celsius = 36.50
Output: [309.65000,97.70000]
Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
```

<strong>Example 2:</strong>
```
Input: celsius = 122.11
Output: [395.26000,251.79800]
Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
```

<strong>Constraints:</strong>

- `0 <= celsius <= 1000`

