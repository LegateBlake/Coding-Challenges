package LeetCode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int nextVal = l1.val + l2.val;
        if (nextVal > 9) {
            nextVal = nextVal % 10;
            carry++;
        }
        final ListNode l3 = new ListNode(nextVal);
        ListNode reference = l3;
        while(l1.next != null || l2.next != null)
        {
            if(l1.next == null) {
                l1.next = new ListNode(0);
            }
            if(l2.next == null){
                l2.next = new ListNode(0);
            }
            l1 = l1.next;
            l2 = l2.next;
            nextVal = l1.val + l2.val + carry;
            carry = 0;
            if (nextVal > 9) {
                nextVal = nextVal % 10;
                carry++;
            }
            reference.next = new ListNode(nextVal);
            reference = reference.next;
        }
        if (carry != 0) {
            reference.next = new ListNode(1);
        }

        return l3;
    }
}