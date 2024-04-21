class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates, (a,b) -> (a[1] - b[1]));
        if(coordinates.length == 2){
            return true;
        }
        int rise = coordinates[1][1] - coordinates[0][1];
        int run = coordinates[1][0] - coordinates[0][0];
        boolean sameX = true;
        boolean sameY = true;
        int countSameX = 0, countSameY = 0;
        for(int i = 0; i < coordinates.length-1; i++){
            if(coordinates[i][0] != coordinates[i+1][0]){
                sameX = false;
            }
            else{
                countSameX++;
            }
            if(coordinates[i][1] != coordinates[i+1][1]){
                sameY = false;
            }
            else{
                countSameY++;
            }
        }
        if(sameX == true || sameY == true){
            return true;
        }
        else if(countSameX >= 1 || countSameY >= 1){
            return false;
        }

        for(int i = 1; i < coordinates.length; i++){
            if((coordinates[i][1]-coordinates[i-1][1])/(coordinates[i][0]-coordinates[i-1][0]) != rise/run){
                return false;
            }  
        }
        return true;


    }
}