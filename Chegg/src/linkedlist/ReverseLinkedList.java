package linkedlist;

/* Given a singly-linked list, output the contents in reverse order, 
 * without recursion or additional memory, and in efficient time.*/

public class ReverseLinkedList {

	public Node reverse(Node head) {
		Node prev = null;
		Node temp = head;
		Node current = head;
		while (current.next != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		current.next = prev;
		return current;
	}

	
	public static void main(String[] args) {
		ReverseLinkedList r = new ReverseLinkedList();
		Node head = new Node(0, new Node(1, new Node(2, new Node(3, new Node(4, null)))));

		Node x = r.reverse(head);
		System.out.println("" + x.data + x.next.data + x.next.next.data + x.next.next.next.data + x.next.next.next.next.data +x.next.next.next.next.next);
	}

}


