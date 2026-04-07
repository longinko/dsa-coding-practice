package list;

// Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);

        ListNode result = reverseList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    private static ListNode reverseList(final ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private static class ListNode {
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
}



