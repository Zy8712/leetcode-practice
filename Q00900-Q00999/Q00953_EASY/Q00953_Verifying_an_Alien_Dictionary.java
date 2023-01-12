class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
        int k = 0;
        for (Character c : order.toCharArray()){
            myMap.put(c, k);
            k++;
        }

        for (int i = 1 ; i < words.length ; i++){
            int len1 = words[i - 1].length();
            int len2 = words[i].length();
            int n = (len1 > len2) ? len2 : len1;

            for (int j = 0 ; j < n ; j++){
                char c = words[i - 1].charAt(j);
                char d = words[i].charAt(j);

                if (myMap.get(c) < myMap.get(d)){
                    break;
                }

                else if (myMap.get(c) == myMap.get(d)){
                    if ((j == n - 1) && (len1 > len2)){
                        return false;
                    }
                    else{
                        continue;
                    }
                }

                else if (myMap.get(c) > myMap.get(d)){
                    return false;
                } 
            }
        }
        return true;
    }
}