package Day;

public class LC28 {
    

    public int solve(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        char[] s = s1.toCharArray();
        char[] p = s2.toCharArray();
        for(int i =0;i<=n-m;i++) {
            int a = i, b=0;
            while(b<m && s[a] == p[b]) {
                a++;
                b++;
            }
            if(b==m) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        
    }
}
