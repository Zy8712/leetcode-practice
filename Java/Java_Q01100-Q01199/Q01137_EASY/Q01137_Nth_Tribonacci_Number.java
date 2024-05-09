class Solution {
    public int tribonacci(int n) {
        int first = 0, second = 1, third = 1, curr = 0;
        if(n == 0){
            return 0;
        }
        else if(n > 0 && n <= 2){
            return 1;
        }
        for(int i=2; i < n; i++){
            curr = first + second + third;
            first = second;
            second = third;
            third = curr;
        }
        return curr;
    }
}