
public class leetcode61 {
    //  Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Calculate the length of the linked list
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head; // No rotation needed

        ListNode  temp1 = head;
        for (int i = 1; i < length - k; i++) {
            temp1 = temp1.next;
        }

        temp.next = head; 
        head = temp1.next; 
        temp1.next = null; 

        return head;
    }
        
    
}
