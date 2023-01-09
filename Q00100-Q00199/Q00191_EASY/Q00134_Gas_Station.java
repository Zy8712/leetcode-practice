class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1;
        int currStation = 0, startingStation = 0;
        int gasTank = 0, costVal;
        boolean success = false;
        for(int i = 0; i < gas.length; i++){
            startingStation = i;
            currStation = i;
            success = false;
            gasTank = gas[currStation];
            //System.out.println(" ");
            //System.out.println("run" + (i+1));
            //System.out.println("station: " +currStation);
            //System.out.println("gas: " +gasTank);

            for(int j = 0; j < gas.length; j++){
                costVal = currStation;
                currStation++;
                if(currStation == gas.length){
                    currStation = 0;
                }
                gasTank = (gasTank - cost[costVal]);
                                
                //System.out.println("station/index: " +currStation);
                //System.out.println("gas: " +gasTank);
                //System.out.println("- "+cost[costVal] +"+ " +gas[currStation]);
                if(gasTank < 0){
                    success = false;
                    break;
                }
                if(gasTank >= 0 && currStation == startingStation){
                    success = true;
                    break;
                }
                else if(gasTank == 0 && currStation != startingStation){
                    success = false;
                    break;
                }
                gasTank += gas[currStation];
            }
            if(success == true){
                index = i;
                break;
            }
        }
        return index;
    }
}
