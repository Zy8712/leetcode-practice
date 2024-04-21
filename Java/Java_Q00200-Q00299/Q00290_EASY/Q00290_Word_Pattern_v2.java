class Solution {
    public boolean wordPattern(String pattern, String s) {
        ArrayList <String> patternArrayList = new ArrayList<>(Arrays.asList(pattern.split("")));
        ArrayList <String> stringSarraylist = new ArrayList<>(Arrays.asList(s.split("\\s+")));
        if(patternArrayList.size() != stringSarraylist.size()){
            return false;
        }
        for (int i = 0; i < patternArrayList.size(); i++){
            for(int j = 1; j < patternArrayList.size(); j++){
                if(patternArrayList.get(i).equals(patternArrayList.get(j)) && !stringSarraylist.get(i).equals(stringSarraylist.get(j))){
                    return false;
                }
                else if (!patternArrayList.get(i).equals(patternArrayList.get(j)) && stringSarraylist.get(i).equals(stringSarraylist.get(j))){
                    return false;
                }
            }
        }
        return true;
    }
}
