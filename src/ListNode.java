/* ITC155 Final Assignment Spring 2020
 * 6/17/2020
 * 
 * Ch 16 LinkedList  p. 1024 ex. 6 Write a method called hasTwoConsequitive...  50 points (40 code + 10 test)
 *  
 */

// ListNode is a class for storing a single node of a linked
// list.  This node class is for a list of integer values.

public class ListNode {
	public int data; // data stored in this node
	public ListNode next; // link to next node in the list

	// Reference to the first element:
	private ListNode head;

	// post: constructs a node with data 0 and null link
	public ListNode() {
		this(0, null);
	}

	// post: constructs a node with given data and null link
	public ListNode(int data) {
		this(data, null);
	}

	// post: constructs a node with given data and given link
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	ListNode front;; // first value in the list

	// post: returns comma-separated, bracketed version of list
	public String toString() {
		if (front == null) {
			return "[]";
		} else {
			String result = "[" + front.data;
			ListNode current = front.next;
			while (current != null) {
				result += ", " + current.data;
				current = current.next;
			}
			result += "]";
			return result;
		}
	}

	// post: appends the given value to the end of the list
	public void add(int value) {
		if (front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new ListNode(value);
		}
	}

	// post: returns the current number of elements in the list
	public int size() {
		int count = 0;
		ListNode current = front;
		while (current != null) {
			current = current.next;
			count++;
		}
		return count;
	}

	// pre : 0 <= i < size()
	// post: returns a reference to the node at the given index
	private ListNode nodeAt(int index) {
		ListNode current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}

	// pre : 0 <= index < size()
	// post: returns the integer at the given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}

	// post : returns the position of the first occurrence of the given
	// value (-1 if not found)
	public int indexOf(int value) {
		int index = 0;
		ListNode current = front;
		while (current != null) {
			if (current.data == value) {
				return index;
			}
			index++;
			current = current.next;
		}
		return -1;
	}

	// pre : 0 <= index < size()
	// post: removes value at the given index
	public void remove(int index) {
		if (index == 0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
	}

	// post: checks whether a linked list is sorted (non-decreasing) and returns true
	public boolean isSorted() {
		if (front == null) {
			return true;
		} else {
			while (front.next != null) {
				ListNode duplicate = front.next; // taking the next data from "front' LinkedList (one index ahead)
				if (front.data > duplicate.data) { // comparing "data[i]" vs "data[i+1]"
					return false;
				}
				front = duplicate; // accumulator, similar to i++
			}
		}
		return true;
	}

	// post: checks whether a linked list has two adjacent numbers and prints the numbers
	public boolean hasTwoConsecutive() {
		if(front == null) {
			return false;
		}
		while (front.next != null) {
			ListNode duplicate = front.next;
			int dataDifference = front.data - duplicate.data; // comparing "data[i]" - "data[i+1]"
			if(dataDifference == -1) {
				System.out.println("The adjacent numbers are " + front.data + " & " + duplicate.data );
				return true;
				
			}
			front = duplicate; // accumulator, similar to i++
		}
		return false;

	}
	
	public static void main(String[] args) {
		ListNode test2 = new ListNode();
		test2.add(49);
		test2.add(5);
		test2.add(103);
		test2.add(49);
		test2.add(50);
		System.out.println(test2.hasTwoConsecutive());

	}

}