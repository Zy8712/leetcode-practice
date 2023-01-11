class Solution {
    public int diagonalSum(int[][] mat) {
        int counter1 = 0;
        int counter2 = mat[0].length-1;
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(j == counter1){
                    sum += mat[i][counter1];
                }
                else if(j == counter2){
                    sum += mat[i][counter2];
                }
            }
            counter1++;
            counter2--;
        }
        return sum;
    }
}