/**
 * @ClassName: LeetCode0083V1
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/6/27
 */
public class LeetCode0083V1 {
    public static ListNodes deleteDuplicates(ListNodes head) {
        ListNodes heads = head;
        if (heads==null||heads.next==null){
            return head;
        }
        while (heads.next!=null){
            if (heads.val==heads.next.val){
                if (heads.next.next!=null){
                    heads.next = heads.next.next;
                }else {
                    heads.next = null;
                    break;
                }
            }else {
                heads = heads.next;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        ListNodes s1 = new ListNodes(1);
        ListNodes s2 = new ListNodes(2);
        ListNodes s3 = new ListNodes(2);


        s1.next = s2;
        s2.next = s3;




        //ListNodes res = deleteDuplicates(s1);

        ListNodes sa = new ListNodes();
        ListNodes  ss= deleteDuplicates(s1);
        while (ss!=null){
            System.out.println(ss.val);
            ss = ss.next;
        }

    }
}
class ListNodes {
      int val;
      ListNodes next;
      ListNodes() {}
      ListNodes(int val) { this.val = val; }
      ListNodes(int val, ListNodes next) { this.val = val; this.next = next; }
}
