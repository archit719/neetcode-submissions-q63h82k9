class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num , map.getOrDefault(num, 0) + 1);

        }
        // min heap
        Queue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        //mantain heap of size k
        for(int num : map.keySet()) {
            pq.add(num);

            if(pq.size() > k) {
                pq.poll();
            }
        }      
        //extract result
        int[] result = new int[k];
        int i = 0;
        while(!pq.isEmpty()) {
            result[i++] = pq.poll();
        }
        return result;
    }
}
