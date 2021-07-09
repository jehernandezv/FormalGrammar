package Structure;

import java.util.Comparator;

public class SimpleList<E> {
	private Node<E> head;
	private Comparator<E> comparator;
	private boolean insert;

	public boolean isInsert() {
		return insert;
	}

	public void setInsert(boolean insert) {
		this.insert = insert;
	}

	public SimpleList(SimpleList<E> list) {
		this.head = list.getHead();
	}

	public SimpleList() {
		this.head = null;
		this.comparator = null;
	}

	public SimpleList(Comparator<E> comparator) {
		this.head = null;
		this.comparator = comparator;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public void add(E info) {

		if (comparator != null) {
			addSort(info);
		} else {
			if (insert) {
				addHead(info);
			} else {
				addLast(info);
			}
		}

	}

	private void addLast(E info) {
		if (head == null) {
			head = new Node<E>(info);
		} else {
			Node<E> aux = head;
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = (new Node<E>(info));
		}
	}

	private void addSort(E info) {

		if (this.head != null) {

			Node<E> aux = head;
			boolean ya = false;
			while (!ya) {
				if (comparator.compare(aux.info, info) <= 0 && aux.next != null
						&& comparator.compare(aux.next.info, info) >= 0) {
					Node<E> nodeAux = aux.next;
					aux.next = new Node<>(info);
					aux.next.next = nodeAux;
					ya = true;
				}

				else if (aux.next == null) {
					if (comparator.compare(head.info, info) < 0) {
						addLast(info);
						ya = true;

					} else {
						addHead(info);
						ya = true;

					}
				}
				aux = aux.next;
			}
		} else {
			head = new Node<>(info);
		}

	}

	public void addHead(E info) {
		head = new Node<E>(info, this.head);
	}

	public Node<E> getHead() {
		return head;
	}

	public void eliminateNodes(Comparator<E> comparator, E info) {
		SimpleList<E> list = search(comparator, info);

		for (int i = 0; i < list.size(); i++) {
			eliminateNode(comparator, info);
		}

	}

	public void eliminateNode(Comparator<E> comparator, E data) {
		if (data != null && head != null) {
			if (comparator.compare(this.head.info, data) == 0) {
				this.head = this.head.next;
			} else {
				Node<E> aux = this.head.next;
				Node<E> previus = this.head;
				while (aux != null) {
					if (comparator.compare(aux.info, data) == 0) {
						previus.next = aux.next;
					}
					previus = aux;
					aux = aux.next;
				}
			}
		}
	}

	public int size() {
		Node<E> aux = this.head;
		int cont = 0;
		while (aux != null) {
			cont++;
			aux = aux.next;
		}
		return cont;
	}

	public SimpleList<E> search(Comparator<E> comparator, E ref) {
		Node<E> aux = head;
		SimpleList<E> list = new SimpleList<>();
		while (aux != null) {
			if (comparator.compare(aux.getInfo(), ref) == 0) {
				list.add(aux.info);
			}
			aux = aux.next;
		}
		return list;
	}

	public boolean isExist(Comparator<E> comparator, E ref) {
		Node<E> aux = head;
		while (aux != null) {
			if (comparator.compare(aux.getInfo(), ref) == 0) {
				return true;
			}
			aux = aux.next;
		}
		return false;
	}

	public boolean isOrder() {

		if (comparator == null) {
			return false;
		} else {
			return true;
		}

	}
}
