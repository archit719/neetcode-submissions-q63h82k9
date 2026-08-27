class Solution {
    public int characterReplacement(String s, int k) {
        int count[] = new int [26];
        int left = 0;
        int ans = 0;
        int maxOccurence = 0;

        for(int right = 0; right < s.length(); right++) {
             count[s.charAt(right) - 'A']++;
             
             maxOccurence = Math.max(maxOccurence, count[s.charAt(right) - 'A']);
            if(right - left + 1 - maxOccurence > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}