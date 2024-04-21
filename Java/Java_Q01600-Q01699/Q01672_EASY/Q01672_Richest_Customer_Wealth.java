class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        int customerCount = accounts.length;
        int bankCount = accounts[0].length;
        int currCustomerCounter;
        for (int i = 0; i < customerCount; i++){
            currCustomerCounter = 0;
            for (int j = 0; j < bankCount; j++){
                currCustomerCounter += accounts[i][j];
            }
            if (currCustomerCounter > richestWealth){
                richestWealth = currCustomerCounter;
            }
        }
        return richestWealth;
    }
}