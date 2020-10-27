
 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = l1;
        int addNext = 0;
        while (p1!=null&&p2!=null){
            p3 = p1;
            int cur = 0;
            int temp = p1.val+p2.val+addNext;
            addNext = temp > 9?1:0;
            p1.val = temp % 10;
            p1= p1.next;
            p2= p2.next;
        }

        if(p1==null&&p2!=null){
            p3.next = p2;
            while (p2!=null){
                p3=p2;
                int temp = p2.val+addNext;
                p2.val = temp %10;
                addNext = temp > 9?1:0;
                p2=p2.next;
            }
        }

        if(p1!=null&&p2==null){
            while (p1!=null){
                p3 = p1;
                int temp = p1.val+addNext;
                p1.val = temp %10;
                addNext = temp > 9?1:0;
                p1=p1.next;
            }
        }

        if(addNext>0){
            p3.next = new ListNode(addNext,null);
        }

        return  l1;
    }
}