/**
 * @ClassName: LeetCode0002V1
 * @Description: 两数相加
 * @Author: ECRZ
 * @Date: 2022/6/13
 */
public class LeetCode0002V1 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode LN = new ListNode(0);
        ListNode OUT = new ListNode(0);
        // 1.计算结果
        while (l1!=null | l2!=null|carry!=0){
            int v1 = 0;
            int v2 = 0;

            if (l1 != null){
                v1 = l1.val;
            }
            if (l2 != null){
                v2 = l2.val;
            }

            int tmp = (v1 + v2 + carry) % 10 ;
            // 2.将结果头插法插入新链表
            ListNode newNode = new ListNode(tmp);
            carry = (v1 + v2 + carry) / 10;
            newNode.next = LN.next;
            LN.next = newNode;

            if (l1!=null){
                l1 = l1.next;
            }
            if (l2!=null){
                l2 = l2.next;
            }

        }
        LN = LN.next;

        while (LN!=null){
            ListNode newNode = new ListNode(LN.val);
            newNode.next = OUT.next;
            OUT.next = newNode;
            LN = LN.next;
        }
        OUT = OUT.next;
        return OUT;
    }


    public static void main(String[] args) {
        ListNode Node1 = new ListNode(2);
        ListNode Node2 = new ListNode(4);
        ListNode Node3 = new ListNode(3);
        Node1.next = Node2;
        Node2.next = Node3;

        ListNode Node4 = new ListNode(5);
        ListNode Node5 = new ListNode(6);
        ListNode Node6 = new ListNode(4);
        Node4.next = Node5;
        Node5.next = Node6;

        ListNode res = addTwoNumbers(Node1,Node4);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
