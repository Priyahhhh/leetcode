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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> lt = new ArrayList<> ();
        ListNode temp=head;
        while(temp!=null){
            lt.add(temp.val);
            temp=temp.next;
        }
        int left=0;
        int right=lt.size()-1;
        while(left<right){
            if(!lt.get(left).equals(lt.get(right))){
               return false;
            }
            left++;
            right--;
        }
        return true;
    }
}