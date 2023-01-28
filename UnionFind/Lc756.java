package UnionFind;


class Lc756 {

    public int minSwapsCouples(int[] row) {

        int len = row.length;
        int n = len/2;
        UnionFind find = new UnionFind(n);
        for(int i =0;i<len;i+=2) {
            find.union(row[i]/2, row[i+1]/2);
        }
        return n -find.getCount();
    
    }

    private class UnionFind {
        private int cnt;
        private int[] parent;

        public int getCount() {
            return cnt;
        }
        public UnionFind(int n) {
            this.cnt = n;
            this.parent = new int[n];
            for(int i=0;i<n;i++) parent[i]= i;
        }
        public int find(int x) {
            while(x!= parent[x]) {
                x = parent[x];
            }
            return x;

        }
        public void union (int x , int y) {
            int rx = find(x);
            int ry = find(y);
            if(rx == ry) return;
            parent[rx] = parent[ry];
            cnt--;
        }
    }

    public static void main(String[] args) {
        

    }
    
}
