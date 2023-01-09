class Solution {
    public boolean detectCapitalUse(String word) {
        char [] wordLetters = word.toCharArray();
        boolean allCaps = false;
        boolean capsUse = false;
        if(word.length() == 1){
            return true;
        }
        if(Character.isUpperCase(wordLetters[0]) && Character.isUpperCase(wordLetters[1])){
            allCaps = true;
        }
        for(int i = 0; i < wordLetters.length; i++){
            if(allCaps == true){
                if(Character.isUpperCase(wordLetters[i])){
                    capsUse = true;
                }
                else{
                    return false;
                }
            }
            else{
                if(i != 0 && Character.isUpperCase(wordLetters[i])){
                    return false;
                }
                else{
                    capsUse = true;
                }
            }
        }
        return capsUse;
    }
}
