class Solution {
    public int maximumCount(int[] nums) {
        int posCount = 0;
        int negCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                negCount++;
            }
            else if(nums[i] > 0){
                posCount++;
            }
        }
        if(posCount > negCount){
            return posCount;
        }
        else if(posCount < negCount){
            return negCount;
        }
        return posCount;
        
    }
}