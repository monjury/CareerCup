package linkedlist;

public class ReverseLinkedListRecursion {

	public Node reverse(Node head) {
		return reverse(head, head, null);
	}

	public Node reverse(Node temp, Node current, Node prev) {
		if (current.next == null) {
			current.next = prev;
			return current;
		} else {
			Node t = current.next;
			current.next = prev;
			return reverse(t, temp, current);
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList r = new ReverseLinkedList();
		Node head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, null)))));
		Node x = r.reverse(head);
		System.out.println("" + x.data + x.next.data + x.next.next.data + x.next.next.next.data + x.next.next.next.next.data +x.next.next.next.next.next);
	}
}
