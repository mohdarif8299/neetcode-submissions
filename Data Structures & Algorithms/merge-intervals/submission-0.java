class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);

        int current[] = intervals[0];

        for(int i=1;i<n;i++) {
            if(current[1] >= intervals[i][0]) {
                current[1] = Math.max(current[1],intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }


        result.add(current);

        return result.toArray(new int[0][0]);

    }
}
