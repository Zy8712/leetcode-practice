class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matrixRow = mat.length;
        int matrixCol = mat[0].length;
        if((matrixRow*matrixCol) != (r*c)){
            return mat;
        }
        int[][] newMatrix = new int[r][c];
        int counter1 = 0;
        int counter2 = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(counter2 == c){
                    counter2 = 0;
                    counter1++;
                }
                newMatrix[counter1][counter2] = mat[i][j];
                counter2++;
            }
        }
        return newMatrix;
    }
}