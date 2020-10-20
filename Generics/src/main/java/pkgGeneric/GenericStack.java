package pkgGeneric;

/*
 * E - Element (used extensively by the Java Collections Framework)
 * K - Key
 * N - Number
 * T - Type
 * V - Value
 */
public class GenericStack<E> implements Comparable<E> {

	private java.util.ArrayList<E> list = new java.util.ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		
		return (list.remove(getSize() -1));
/*		
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
		*/
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	@Override
	public int compareTo(E o) {
		// TODO Auto-generated method stub
		return 0;
	}


}