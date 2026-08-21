/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        // Create clone nodes
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Connect next and random
        temp = head;

        while (temp != null) {
            Node clone = map.get(temp);

            clone.next = map.get(temp.next);
            clone.random = map.get(temp.random);

            temp = temp.next;
        }

        return map.get(head);
    }
}