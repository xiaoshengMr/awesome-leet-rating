
package Day;

public class LC2483 {

    public int solve(String customers){
        int res = 0, cost = 0 ,ans =0;
        for( int i=0;i< customers.length();i++) {
            if( customers.charAt(i) == 'Y')  cost++;
        }
        res = cost;
        for( int i=1;i< customers.length();i++) {
            if(customers.charAt(i) == 'N') {cost ++;}
            else {
                cost --;
                if (cost < res) {
                    cost  =res;
                    ans = i+1;
                }                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
