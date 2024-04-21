class Solution {
    public String interpret(String command) {
        char [] letters = command.toCharArray();
        ArrayList<String>goalLetters = new ArrayList<>();
        for(int i = 0; i < letters.length; i++){
            if(letters[i] == 'G'){
                goalLetters.add("G");
            }
            else if(letters[i] == '(' && letters[i+1] == ')'){
                goalLetters.add("o");
            }
            else if(letters[i] == '(' && letters[i+1] == 'a'){
                goalLetters.add("al");
            }
        }
        String str = "";
        for(String ggs : goalLetters){
            str += ggs;
        }
        return str;
    }
}