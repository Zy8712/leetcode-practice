class Solution {
    public boolean isHappy(int n) {
        int currNum = n;
        char [] digits;
        while(currNum != 1){
            digits = ("" + currNum).toCharArray();
            if(digits.length <= 1 && currNum%2 == 0){
                break;
            }
            currNum = 0;
            for(int i = 0; i < digits.length; i++){
                currNum += Math.pow(Character.getNumericValue(digits[i]), 2);
            }
            if(currNum == n){
                break;
            }
        }

        if(currNum == 1){
            return true; 
        }
        else{
            return false;
        }
    }
}