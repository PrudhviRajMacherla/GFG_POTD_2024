class Solution {
    ArrayList<Integer> dfs = new ArrayList<>();
    public void dfsTraversal(int curr,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        if(vis[curr]==true){
            return;
        }
        
        vis[curr]=true;
        dfs.add(curr);
        List<Integer> neig = adj.get(curr);
        for(Integer e: neig)
        {
            if(vis[e]==false){
                dfsTraversal(e,vis,adj);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        int nodes = adj.size();
        boolean[] vis = new boolean[nodes];
        for(int i=0;i<nodes;i++){
            if(vis[i]==false){
                dfsTraversal(i,vis,adj);
            }
        }
        
        
        return dfs;
    }
}