/**
	Iterable Interface
*/
Q. What is an Iterable?
A. Has a method that returns an Iterator 

public interface Iterable<Item> {
	Iterator<Item> iterator();
}

Q. What is an Iterator?
A. Has methods hasNext() and next();

public interface Iterator<Item> {
	boolean hasNext();
	Item next();
	void remove();
}

Example Code: 
// iterate a stack
Iterator<String> i = stack.iterator();
while (i.hasNext()) {
	String s = i.next();
	StdOut.println(s);
} // first time call next() will return the first element
