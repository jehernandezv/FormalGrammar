package Structure;

public class Node<T> {
	
	protected T info;
	protected Node<T> next;

	public Node(T info) {
		this.info = info;
	}

	public Node(T info, Node<T> next) {
		super();
		this.info = info;
		this.next = next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
