class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ng[] = helper(nums2);

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums2.length;i++) {
            map.put(nums2[i], ng[i]);
        }


        int arr[] = new int[nums1.length];

        for(int i=0;i<nums1.length; i++) {
            arr[i] = map.get(nums1[i]);
        }

        return arr;
    }


    public int[] helper(int nums[]) {
        Stack<Integer> stack = new Stack<>();

        int arr[] = new int[nums.length];


        Arrays.fill(arr, -1);

        for(int i=0;i<arr.length;i++) {

            if(stack.isEmpty()) {
                stack.push(i);
            } else {
                while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) arr[stack.pop()] = nums[i];
                stack.push(i);
            }
        }

        return arr;
    }
}