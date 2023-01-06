class Solution {
    public boolean isPalindrome(int x) {
        char [] digits = ("" + x).toCharArray();
        int iterations = 0;
        if(digits.length%2 == 0){
            iterations = digits.length/2;
        }
        else{
            iterations = (digits.length/2)+1;
        }
        for(int i = 0; i < iterations; i++){
            if(digits[i] != digits[digits.length-i-1]){
                return false;
            }
        }
        return true;
    }
}