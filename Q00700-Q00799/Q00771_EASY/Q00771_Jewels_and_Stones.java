class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char [] jewelArray = jewels.toCharArray();
        char [] stoneArray = stones.toCharArray();
        int counter = 0;
        for(int i = 0; i < stoneArray.length; i++){
            for(int j = 0; j < jewelArray.length; j++){
                if(stoneArray[i] == jewelArray[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
}