public class leetcode86 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        // create 2 dummy nodes
        // which will help to create 2 list --> 1. which holds the value smaller than x
        // 2. which holds the value smaller than equal to x
        ListNode smaller = new ListNode();
        ListNode bigger = new ListNode();

        // initialize the two heads for list
        ListNode head1 = smaller; //head of smaller list
        ListNode head2 = bigger; //head of bigger list

        while(head != null){
            // adding the smaller value node to smaller list
            if(head.val < x){
                head1.next = head;
                head1 = head1.next;
            }
            else{
                head2.next = head;
                head2 = head2.next;
            }

            head = head.next;
        }

        // breaking the connection of last node of bigger list
        head2.next = null;
        // connect the two list
        head1.next = bigger.next;
        // remove the dummy node
        bigger.next = null; 
        head = smaller.next;
        smaller.next = null;

        return head;
    }
}
