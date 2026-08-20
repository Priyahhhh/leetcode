/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Store elements in ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();

        // Step 2: Avoid unnecessary rotations
        k = k % n;

        int start = n - k;

        // Step 3: Put rotated elements back into LL
        temp = head;

        for (int i = start; i < n; i++) {
            temp.val = list.get(i);
            temp = temp.next;
        }

        for (int i = 0; i < start; i++) {
            temp.val = list.get(i);
            temp = temp.next;
        }

        return head;
    }
}