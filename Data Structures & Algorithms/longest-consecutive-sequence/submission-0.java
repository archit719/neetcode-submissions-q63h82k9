class Solution {
    public int longestConsecutive(int[] nums) {
        //HashSet removing duplicates
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        //iterating over unique values 
        int longest = 0;
        for(int num : set) {
            //check if num is part of a sequence
            if(!set.contains(num - 1)) {
                int current = num;
                //move forward until sequence breaks
                int length = 1;
                while(set.contains(current + 1)) {
                    current ++;
                    length++;
                }
                //updating the answer
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
