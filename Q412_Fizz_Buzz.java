class Solution {
    public List<String> fizzBuzz(int n) {
        if (n <= 0){
            return null;
        }
        int counter = 1;
        ArrayList <String> returnValue = new ArrayList<String>();
        while (counter <= n){
            if (counter % 3 == 0 && counter % 5 == 0){
                returnValue.add("FizzBuzz");
            }
            else if (counter % 3 == 0){
                returnValue.add("Fizz");
            }
            else if (counter % 5 == 0){
                returnValue.add("Buzz");
            }
            else{
                returnValue.add(String.valueOf(counter));
            }
            counter++;
        }
        return returnValue;
    }
}