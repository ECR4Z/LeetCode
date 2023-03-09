/**
 * @ClassName: LeetCode0206V1
 * @Description: 反转链表
 * @Author: ECRZ
 * @Date: 2022/7/1
 */
public class LeetCode0206V1 {
    public static ListNode reverseList(ListNode head) {
        if (head==null){
            return null;
        }
        ListNode tmp = new ListNode(0);
        while (head!=null){
            ListNode temp = new ListNode(head.val);
            System.out.println(head.val);
            temp.next = tmp.next;
            tmp.next = temp;
            head = head.next;
        }
        return tmp.next;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode res = reverseList(n1);
        while (res!=null){
            System.out.printf("value:%d  ",res.val);
            res = res.next;
        }
    }
}
