class Solution {
    public int minDeletionSize(String[] strs) {
        int deletionCounter = 0;
        char [][] letters = new char [strs.length][strs[0].length()];
        for(int i = 0; i < strs.length; i++){
            for(int j = 0; j < strs[0].length(); j++){
                letters[i][j] = strs[i].charAt(j);
            }
        }
        char [] column = new char [strs.length];
        char [] copy = new char [strs.length];
        for(int i = 0; i < strs[0].length(); i++){
            for(int j = 0; j < strs.length; j++){
                column[j] = letters[j][i]; // copy the letters for a column i
                copy[j] = column[j]; 
            }
            Arrays.sort(column);
            for(int k = 0; k < column.length; k++){
                if(column[k] != copy[k]){
                    deletionCounter++;
                    break;
                }
            }

        }
        return deletionCounter;
    }
}
