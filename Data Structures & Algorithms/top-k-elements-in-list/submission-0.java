class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }


        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(entry);
            if(queue.size() > k) queue.poll();
        }


        int ans[] = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = queue.poll().getKey();
        }
        return ans;
    }
}
