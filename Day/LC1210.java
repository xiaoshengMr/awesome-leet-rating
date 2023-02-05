package Day;

import java.util.*;

public class LC1210 {

    private static int[][] dir = {{1,0,0},{0,1,0},{0,0,1}};

    public int solve(int[][] g) {
        int n = g.length;   
        // 记录是否访问
        boolean[][][] vis = new boolean[n][n][2];
        // 记录位置
        List<int[]> q = new ArrayList<int[]>();
        q.add(new int[]{0,0,0});
        vis[0][0][0] = true;
        for(int step =1; !q.isEmpty(); ++step) {
            List<int[]> ans = q;
            q = new ArrayList<>();
            for(int[] t : ans) {
                for(int[] d: dir) {
                    int x = t[0] + d[0], y = t[1] + d[1], s= t[2] ^ d[2];
                    int x2 = x + s, y2 = y+ (s^1);
                    if( x2<n && y2<n && !vis[x][y][s]
                        && g[x][y] == 0 && g[x2][y2] ==0 && 
                        (d[2] ==0 || g[x+1][y+1] == 0)) {
                        if(x == n-1 && y == n-2) return step;
                        vis[x][y][s] = true;
                        q.add(new int[] {x,y,s});
                    }
                }
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        
    }    
}