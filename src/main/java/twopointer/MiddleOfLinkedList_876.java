package twopointer;

public class MiddleOfLinkedList_876 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode root = head;
        int length = 0;
        while (root != null) {
            root = root.next;
            length++;
        }

        length = (int) Math.ceil(length / 2);
        for (int i = 0; i < length; i++) {
            head = head.next;
        }

        return head;
    }
}



