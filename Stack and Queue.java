/** 
stack implementation in linkedlist:
*/ 
public class LinkedStackOfStrings {
	private Node first = null; // initialize the first pointing node 
	private class Node {
		String item;
		Node next;
	}
}


// 1. pop() -> remove and return the string most recently added 

String item = first.item; // save the item to return 
first = first.next; // delete the first node, Note: first is not in the stack
return item; // return saved item


// 2. push(String item) -> insert a new string onto stack

Node oldfirst = first; // save a link to the list (as oldfirst)
first = new Node(); // create a new node for the beginning 
first.item = "not"; 
first.next = oldfirst; // set the instance variables in the node, now first is the new "first"

// 3. isEmpty() -> return a boolean value 

return first == null; // true means isEmpty 


// Complete Generic Edition:
public class Stack<Item> {
	private Node first = null;

	private class Node {
		Item item;
		Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void push(Item item) {
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
	}

	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
	}


}


/** 
stack implementation in resizing-array 
Time Complexity: Insert worst -> O(n), amortized -> O(1)
*/

public ResizingArrayStackOfStrings() {
	s = new String[1];
}

/* if array is full, create a new array of twice the size, and copy the items */
public void push(String item) {
	if (N == s.length) { 
		resize(2 * s.length);
	}
	s[N++] = item;
}
/* reset to the size of capacity */
private void resize(int capacity) {
	String[] copy = new String[capacity];
	for (int i = 0; i < N; i++) {
		copy[i] = s[i];
	}
	s = copy;
}

/* halve the size of array s[] when array is one-quarter full */
public String pop() {
	String item = s[--N]; // copy the item prior to the pop out one.
	S[N] = null; // set the pop out one to null
	if (N > 0 && N == s.length/4) {
		resize(s.length/2); 
	}
	return item;
}

/* Trade off: 
Linked-list implementation:

・Every operation takes constant time in the worst case.
・Uses extra time and space to deal with the links.

Resizing-array implementation:

・Every operation takes constant amortized time.
・Less wasted space.

*/


/** 
Queue implementation in linkedlist 
*/
public class LinkedQueueOfStrings {
	private Node first, last;

	private class Node {
	String item;
	Node next;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void enqueue(String item) {
		Node oldlast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last; // point to null
		} else {
			oldlast.next = last;
		}
	}

	public String dequeue() {
		String item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		return item;
	}
}




