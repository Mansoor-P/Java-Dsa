package src.leetcode;

 class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class DeleteTheMiddleNodeOfaLinkedList_2095 {
    public static ListNode deleteMiddle(ListNode head) {
        // Edge case: If the list has 0 or 1 nodes, return null
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Fast moves two steps, slow moves one step
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node by skipping it
        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        // Example: Creating a linked list [1 -> 2 -> 3 -> 4 -> 5]
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        // Deleting the middle node
        head = deleteMiddle(head);

        // Printing the updated linked list
        printList(head);
    }

    private static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
