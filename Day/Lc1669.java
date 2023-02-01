package Day;

public class Lc1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null && list2 == null) {
            return null;
        }
        // 遍历list2 
        ListNode head2 = list2 , tail2  =  null;
        while(list2 != null) {
            list2 = list2.next;
            tail2 = list2;
        }

        ListNode head1 = list1, ans = null;
        while(list1 != null) {
            // 下一个节点值
            int val = list1.next.val;
            if(val == a) {
                ans = list1.next;
                list1.next = head2;
            }
        }
        System.out.println();
        while(ans != null) {
            int val = ans.next.val;
            if(val == b) {
                tail2.next = ans.next.next;
                ans.next.next = null;
            }
        }
        return head1;
    }

    public static void main(String[] args) {
        
    }

     class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
}