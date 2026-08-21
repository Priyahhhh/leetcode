/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    ArrayList<Node> arr = new ArrayList<>();
    public Node flatten(Node head) {
        collect(head);
        for (int i = 0; i < arr.size() - 1; i++) {
            Node curr = arr.get(i);
            Node next = arr.get(i + 1);
            curr.next = next;
            next.prev = curr;
            curr.child = null;
        }
        if (arr.size() > 0) {
            arr.get(arr.size() - 1).next = null;
            arr.get(arr.size() - 1).child = null;
        }
        return head;
    }
    public void collect(Node head) {
        Node temp = head;
        while (temp != null) {
            arr.add(temp);
            if (temp.child != null) {
                collect(temp.child);
            }
            temp = temp.next;
        }
    }
}