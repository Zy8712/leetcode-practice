class Solution {
    public int arraySign(int[] nums) {
        int negativeCounter = 0;
        boolean zeroPresent = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroPresent = true;
                break;
            }
            if(nums[i] < 0){
                negativeCounter++;
            }
        }
        if(zeroPresent == true){
            return 0;
        }
        else if(negativeCounter%2 != 0){
            return -1;
        }
        else{
            return 1;
        }
    }
}