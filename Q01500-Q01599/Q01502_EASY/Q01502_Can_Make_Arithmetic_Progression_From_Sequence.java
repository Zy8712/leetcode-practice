class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int progress = arr[1] - arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i] + progress != arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
