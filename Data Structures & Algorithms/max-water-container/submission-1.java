class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0, p2 = heights.length-1;
        int max = 0;
        while(p1 < p2) {

            int width = p2-p1;
            int height = Math.min(heights[p1], heights[p2]);
            int area = width * height;

            max = Math.max(max, area);

            if(heights[p1] < heights[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        return max;
    }
}
