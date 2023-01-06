class Solution {
    public int subtractProductAndSum(int n) {
        char [] digits = ("" + n).toCharArray();
        int product = 1;
        int sum = 0;
        for(int i = 0; i < digits.length; i++){
            product *= Character.getNumericValue(digits[i]);
            sum += Character.getNumericValue(digits[i]);
        }
        return product - sum;
    }
}