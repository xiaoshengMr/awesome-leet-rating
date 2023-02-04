package Day;

import java.util.*;
public class LC2461 {
    

    public long slove(int[] nums, int k) {

        int n = nums.length;
        

        int sum = 0, res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i< k;i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        if(map.size() == k) res = Math.max(sum, res);

        for(int i=k;i<n;i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
            
            sum -= nums[i-k];
            int cnt = map.get(nums[i-k]);
            if(cnt ==1) map.remove(nums[i-k]);
            else map.put(nums[i-k], cnt -1);
            if(map.size() == k) res = Math.max(res, sum);
        }
        return res;



    }
    public static void main(String[] args) {
        
    }
}
