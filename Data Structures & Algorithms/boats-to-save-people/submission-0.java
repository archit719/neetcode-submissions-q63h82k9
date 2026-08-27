class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boat = 0;
        int left = 0;
        int right = people.length - 1;

        while(left <= right) {
            int remaining = limit - people[right--];
            boat++;
            if(left <= right && remaining >= people[left]) {
                left++;
            }
        }
        return boat;
    }
}