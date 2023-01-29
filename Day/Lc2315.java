package Day;

public class Lc2315 {
    
    public int countAsterisks(String s) {
        int res = 0 ,total = 0;
        boolean first = false;
        for(int i =0;i<s.length();i++) {
            char c = s.charAt(i);
            // 统计所有*
            if(c == '*') total ++;
            // 开始统计 f =true
            if(c == '|' && first == false) {
                first = true;
            } else if(c == '|' && first == true) {
                first = false;
            }
            if(first == true && c == '*') {
                res ++;
            }
        }
        return total-res;
    }

    public static void main(String[] args) {
        String s = "iamprogrammer";
        Lc2315 l = new Lc2315();
        int res = l.countAsterisks(s);
        System.out.println(res);
    }
}
