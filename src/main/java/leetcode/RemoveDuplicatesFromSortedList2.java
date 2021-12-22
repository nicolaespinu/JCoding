package leetcode;

public class RemoveDuplicatesFromSortedList2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        System.out.println();
        showList(head);
        System.out.println();
        deleteDuplicates(head);
        System.out.println("Deleted");
        showList(head);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode prev = new ListNode(head.val - 1);
        prev.next = head;
        ListNode node = prev;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                node.next = head.next;
            } else {
                node = node.next;
            }
            head = head.next;
        }
        return prev.next;
    }

    public static void showList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
