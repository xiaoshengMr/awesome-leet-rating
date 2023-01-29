package UnionFind;

public class Lc785 {

    //  二分图顶点的所有边属于一个集合 且不与顶点一个集合
    public boolean isBipartite(int[][] graph) {
        int n  = graph.length;
        UnionFind uf = new UnionFind(n);
        for(int i = 0;i< n;i++) {
           int[] ans = graph[i];
           for(int w: ans) {
            if(uf.isConnect(i, w)) {
                return false;
            }
             uf.union(ans[0], w);
           }
        }
        return true;
    }
    

    private class UnionFind {
        private int[] parent;

        
        public UnionFind(int n) {
            this.parent = new int[n];
            for(int i=0;i<n;i++) parent[i]= i;
        }
        public int find(int x) {
            while(x!= parent[x]) {
                x = parent[x];
            }
            return x;
        }
        public boolean isConnect(int p,int q) {
            return find(p) ==find(q);
        }
        public void union(int x , int y) {
            int rx = find(x);
            int ry = find(y);
            if(rx == ry) return;
            parent[rx] = parent[ry];
        }
    }

    public static void main(String[] args) {
        int[][]  input = {{1,2,3},{0,2},{0,1,3},{0,2}};
        Lc785 lc = new Lc785();
        boolean res = lc.isBipartite(input);
        System.out.println(res);
    }
}
