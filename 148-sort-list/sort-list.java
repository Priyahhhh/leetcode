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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ArrayList<Integer> lt = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            lt.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(lt);
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = lt.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}