package MiddleOfTheLinkedList;

import testing.TestCase;

class Solution {
    public TestCase caseOne = new TestCase(new int[]{1, 2, 3, 4, 5});

    public ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        
    }
}