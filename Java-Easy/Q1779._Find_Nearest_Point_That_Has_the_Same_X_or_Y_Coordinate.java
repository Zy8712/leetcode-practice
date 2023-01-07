class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int shortestDistance = Integer.MAX_VALUE;
        int arrayIndexShortest = -1;
        int distanceCalc;
        for(int i = 0; i < points.length; i++){
            if(points[i][0] == x || points[i][1] == y){
                double xDifference = x - points[i][0];
                double yDifference = y - points[i][1];
                distanceCalc = (int)Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2)); 
                if(distanceCalc < shortestDistance){
                    shortestDistance = distanceCalc;
                    arrayIndexShortest = i;
                }
            }
        }
        return arrayIndexShortest;
    }
}