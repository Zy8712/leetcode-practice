class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        int downCount = 0;
        int currNum = nums[0];
        int temp;
        if(nums.length <= 1){
            return uniqueCount;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i-downCount] != currNum){
                uniqueCount++;
                currNum = nums[i-downCount];
            }
            else{
                for(int j = i-downCount; j < nums.length-1; j++){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                downCount++;
            }
        }
        return uniqueCount;
    }
}