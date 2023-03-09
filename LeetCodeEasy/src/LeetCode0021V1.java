/**
 * @ClassName: LeetCode0021V1
 * @Description: 合并两个有序链表
 * @Author: ECRZ
 * @Date: 2022/6/20
 */
public class LeetCode0021V1 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode tail = new ListNode(0);
        head.next = tail;

        while (list1!=null|list2!=null){
            if (list1 == null){
                tail.next = list2;
                break;
            }

            if (list2 == null){
                tail.next = list1;
                break;
            }

            if (list1.val <= list2.val){
                ListNode tmp = new ListNode(list1.val);
                tail.next = tmp;
                tail = tmp;
                list1 = list1.next;
            }else{
                ListNode tmp = new ListNode(list2.val);
                tail.next = tmp;
                tail = tmp;
                list2 = list2.next;
            }
        }
        return head.next.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        ListNode r1 = new ListNode(1);
        ListNode r2 = new ListNode(3);
        ListNode r3 = new ListNode(4);
        r1.next = r2;
        r2.next = r3;

        ListNode res = mergeTwoLists(l1,r1);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
