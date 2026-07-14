class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet alphabetSet = new HashSet<>();
        for(int i = 'a'; i <= 'z'; i++) {
            alphabetSet.add((char) i);
        }
        //Remove every character and check if set becomes empty 
        for(int i = 0; i < sentence.length(); i++) {
            alphabetSet.remove(sentence.charAt(i));
            if(alphabetSet.isEmpty()) {
                return true;

            }
        }
        return  false;
    }
}
