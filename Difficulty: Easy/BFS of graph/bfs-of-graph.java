class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        ArrayList<Integer> bfs = new ArrayList<>();
        int nodes = adj.size();
        boolean[] vis = new boolean[nodes];
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            bfs.add(curr);
            List<Integer> neig = adj.get(curr);
            for(Integer e: neig){
                if(vis[e]==false){
                    q.offer(e);
                    vis[e]=true;
                }
            }
        }
        return bfs;
        
    }
}