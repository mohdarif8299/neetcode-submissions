class Solution {
    public int[] searchRange(int[] nums, int target) {

        int startIndex = getStartIndex(nums, target);
        int endIndex = getEndIndex(nums, target);

        return new int[]{startIndex, endIndex};
    }

    public int getStartIndex(int nums[], int target) {
        int low = 0, high = nums.length-1;
        int startIndex = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(nums[mid] == target) {
                startIndex = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target) {
                high--;
            } else {
                low++;
            }
        }
        return startIndex;
    }

    public int getEndIndex(int nums[], int target) {
        int low = 0, high = nums.length-1;
        int endIndex = -1;

        while(low <= high) {
            int mid = (low + high)/2;

            if(nums[mid] == target) {
                endIndex = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target) {
                high--;
            } else {
                low++;
            }
        }
        return endIndex;
    }
}