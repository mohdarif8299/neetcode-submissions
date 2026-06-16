class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            set.add(num);
        }

        int longest = 0;

        for(int i=0;i<nums.length;i++) {

            int x = nums[i];
            int length = 1;
            while(set.contains(x-1)) {
                x = x - 1;
                length++;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
}
