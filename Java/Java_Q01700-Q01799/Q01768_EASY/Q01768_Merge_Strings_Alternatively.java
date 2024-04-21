class Solution {
    public String mergeAlternately(String word1, String word2) {
        char [] letters1 = word1.toCharArray();
        char [] letters2 = word2.toCharArray();
        ArrayList<String>combined = new ArrayList<>();
        int reps, counter = 0;
        if(letters1.length > letters2.length){
            reps = letters1.length;
        }
        else{
            reps = letters2.length;
        }
        for(int i = 0; i < reps; i++){
            if(counter >= letters1.length){
                combined.add(Character.toString(letters2[i]));
            }
            else if(counter >= letters2.length){
                combined.add(Character.toString(letters1[i]));
            }
            else{
                combined.add(Character.toString(letters1[i]));
                combined.add(Character.toString(letters2[i]));
            }
            counter++;
        }
        String str = "";
        for(String com : combined){
            str += com;
        }
        return str;
    }
}