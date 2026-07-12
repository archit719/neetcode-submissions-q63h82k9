class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            //Set to store elements seen in the iteration
            Set<Integer> hashset = new HashSet<>();

            for(int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                //If hashset is already in set, we found a triplet
                if(hashset.contains(third)) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    Collections.sort(temp);
                    ans.add(temp); 
                }
                //add current value to the set
                hashset.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);

    }
}