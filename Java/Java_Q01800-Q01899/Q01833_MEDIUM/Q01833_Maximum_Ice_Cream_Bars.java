class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int icecreamCounter = 0;
        for(int i = 0; i < costs.length; i++){
            if(coins < costs[i]){
                break;
            }
            coins -= costs[i];
            icecreamCounter++;
        }
        return icecreamCounter;
    }
}
