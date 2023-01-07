class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        int maxPerim = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                if(nums[i] + nums[j] > nums[j+1]){
                    if(nums[i] + nums[j] + nums[j+1] > maxPerim){
                        maxPerim = nums[i] + nums[j] + nums[j+1];
                    }
                }
            }
        }
        return maxPerim;
    }
}