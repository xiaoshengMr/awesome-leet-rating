package Day;


import java.util.*;
public class LC1604 {
    

    public List<String> solve(String[] keyName, String[] keyTime) {

        Map<String, List<Integer>> res =new HashMap<>();
        int n = keyName.length;
        for(int i =0; i<n; i++) {
            String name  = keyName[i];
            String time = keyTime[i];
            res.putIfAbsent(name, new ArrayList<>());
            int h = (time.charAt(0)-'0') *10 + (time.charAt(1)-'0');
            int m = (time.charAt(3)-'0') *10 + (time.charAt(4)-'0');
            res.get(name).add(h * 60 + m);
        }
        List<String>  ans = new ArrayList<String>();
            Set<String> key = res.keySet();
        for(String name : key) {
            List<Integer> list = res.get(name);
            Collections.sort(list);
            int l = list.size();
            for(int i=2; i<l;i++) {
                if(list.get(i)- list.get(i-2) <= 60) {
                    ans.add(name);
                    break;
                }
            }
        }    
        Collections.sort(ans);
        return ans;
        }
    public static void main(String[] args) {
        
    }
}
