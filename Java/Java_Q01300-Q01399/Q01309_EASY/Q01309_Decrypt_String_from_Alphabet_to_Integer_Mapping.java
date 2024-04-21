class Solution {
    public String freqAlphabets(String s) {
        char [] chArr = s.toCharArray();        
        StringBuilder answer = new StringBuilder();
        
        for(int idx = 0; idx < chArr.length; idx++) {
            if(idx+2 < chArr.length && chArr[idx+2] =='#'){
                answer.append(encodedChar(chArr[idx], chArr[idx+1]));
                idx += 2;
            }
            else{                
                answer.append(encodedChar(chArr[idx]));
            }
        }
        return new String(answer);
    }
    
    public char encodedChar(char c1, char c2){
        //(char)((c1-'0')*10 + (c2-'0') + 'a' -1)
        //(char)((c1-48)*10 + (c2-48) + 97 -1)
        return (char)((c1-48)*10 + (c2-48) + 96);
    }
    
    public char encodedChar(char c1){
        //(char)(c1-'0'+'a'-1)
        //(char)(c1-'0'+ 97 - 1)
        //(char)(c1-48 + 96)
        return (char)(c1-48 + 96);        
    }
}