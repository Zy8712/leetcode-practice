class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0, length;
        for(int i = 0; i < nums.length; i++){
            length = Integer.toString(nums[i]).length();
            if(length % 2 == 0){
                counter++;
            }        
        }
        return counter;
    }
}