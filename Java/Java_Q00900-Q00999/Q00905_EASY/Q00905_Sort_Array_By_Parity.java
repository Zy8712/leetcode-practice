class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int [] nums2 = new int[nums.length];
        int counter = nums.length-1;
        int counter2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums2[counter2] = nums[i];
                counter2++;
            }
            else{
                nums2[counter] = nums[i];
                counter--;
            }
        }
        return nums2;
    }
}