class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[n];

        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int count = 0;
        for(int node = 0;node<n;node++) {
            if(visited[node] == false) {
                dfs(adj, visited, node);
                count++;
            }
        }
        return count;
    }

    public static void dfs(List<List<Integer>> adj, boolean visited[], int node) {
        visited[node] = true;
        for(int i: adj.get(node)) {
            if(visited[i] == false) {
                dfs(adj, visited, i);
            }
        }
    }
}
