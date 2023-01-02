class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomNoteLength = ransomNote.length();
        int magazineLength = magazine.length();
        boolean outcome = true;
        int index;
        ArrayList<String> items = new ArrayList <String> (Arrays.asList(magazine.split("")));

        for (int i = 0; i < ransomNoteLength; i++){
            char ransomLetter = ransomNote.charAt(i);
            index = items.indexOf(String.valueOf(ransomLetter));
            
            if (index == -1){
                outcome = false;
                break;
            }
            else{
                items.remove(index);
            }
        }
        return outcome;
    }
}
