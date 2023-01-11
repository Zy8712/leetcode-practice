class Solution {
    public char findTheDifference(String s, String t) {
        char [] sChars = s.toCharArray();
        char [] tChars = t.toCharArray();
        int ascii1 = 0;
        int ascii2 = 0;
        for(int i = 0; i < sChars.length; i++){
            ascii1 += (int) sChars[i];
        }
        for(int i = 0; i < tChars.length; i++){
            ascii2 += (int) tChars[i];
        }
        char letterAdded = (char)(ascii2 - ascii1); 
        return letterAdded;
    }
}