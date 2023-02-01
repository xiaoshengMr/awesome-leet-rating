package Day;

import java.util.HashMap;
import java.util.Map;

public class LC2325 {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        int j =0;
        for(int i=0;i<key.length();i++) {
            Character c = key.charAt(i);
            if (c != ' ') {
                System.out.println("k:"+ c + "v:" + (char)('a' + j));
                if(!map.containsKey(c)) {
                    map.put(c, (char)('a' + j));
                    j++;
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<message.length();++i) {
            Character c = message.charAt(i);
            if( c != ' ') res.append(map.get(c));
            else res.append(c);   
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog"; 
        String message = "vkbs bs t suepuv";
        LC2325 sLc2325 = new LC2325();
        String res = sLc2325.decodeMessage(key, message);
        System.out.println(res);
    }
}
