class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0 && nums[i] == counter){
                counter++;
            }
            else if(nums[i] > 0 && nums[i] < counter){
                continue;
            }
            else if(nums[i] > 0 && nums[i] != counter){
                return counter;
            }

        }
        return counter;
    }
}
