class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> stack = new Stack<>();
        int [] ans = new int[nums1.length];
        int [] temp = new int[nums2.length];
        for (int i = nums2.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]){
                stack.pop();
            }
            if (i >= 0){
                if (!stack.isEmpty()){
                    temp[i] = stack.peek();
                }else {
                    temp[i] = -1;
                }
                stack.push(nums2[i]);
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if (nums1[i] == nums2[j]){
                    ans[i] = temp[j];
                }
            }
        }
        return ans;
    }
}