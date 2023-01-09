class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int [] weakestRows = new int [k];
        int rowValueCounter [] = new int [mat.length];
        int rowNum [] = new int [mat.length];

        for (int i = 0; i < mat.length; i++){
            rowNum[i] = i;
            rowValueCounter[i] = 0;
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 0){
                    break;
                }
                rowValueCounter[i] += mat[i][j];
            }
        }

        int temp;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat.length-i-1; j++){
                if (rowValueCounter[j] > rowValueCounter[j+1]){
                    temp = rowValueCounter[j];
                    rowValueCounter[j] = rowValueCounter[j+1];
                    rowValueCounter[j+1] = temp;
                    temp = rowNum[j];
                    rowNum[j] = rowNum[j+1];
                    rowNum[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < k; i++){
            weakestRows[i] = rowNum[i];
        }

        return weakestRows;
    }
}
