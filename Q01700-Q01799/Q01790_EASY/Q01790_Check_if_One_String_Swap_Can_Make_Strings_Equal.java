class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        else if(s1.length() != s2.length()){
            return false;
        }
        else if(s1.length() == 2 && s1.equals(s2) == false){
            return false;
        }
        char [] letters = s1.toCharArray();
        for(int i = 0; i < letters.length; i++){
            if(s2.contains(Character.toString(letters[i])) == false){
                return false;
            }
        }
        char [] letters2 = s2.toCharArray();
        int differences = 0;
        int asciiCount1 = 0;
        int asciiCount2 = 0;
        for(int j = 0; j < letters.length; j++){
            asciiCount1 += (int) letters[j];
            asciiCount2 += (int) letters2[j];
            if(letters[j] != letters2[j]){
                differences++;
            }
        }
        if(differences > 2 || differences == 1 || asciiCount1 != asciiCount2){
            return false;
        }
        return true;
    }
}
