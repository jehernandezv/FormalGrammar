package Structure;

public class NTree<T> {

	private NTreeNode<T> root;

	public NTree() {
		this.root = null;
	}

	public NTreeNode<T> getRoot() {
		return root;
	}

	public void setRoot(NTreeNode<T> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return this.root == null;
	}

	public void add(T info) {
		this.root = new NTreeNode<>(info);
	}

	public boolean add(T info, T parent) {
		NTreeNode<T> auxParent = searchParent(parent);
		if (auxParent != null) {
			auxParent.childs.add(new NTreeNode<>(info));
			return true;
		} else {
			return false;
		}
	}

	public NTreeNode<T> searchParent(T info) {
		return searchParent(root, info);

	}

	private NTreeNode<T> searchParent(NTreeNode<T> auxRoot, T info) {
		if (auxRoot.info != info) {
			Node<NTreeNode<T>> aux = auxRoot.childs.getHead();
			while (aux != null) {
				NTreeNode<T> tmp = searchParent(aux.info, info);
				if(tmp!= null) {
					return tmp;
				}
				aux = aux.next;
			}
			return null;
		} else {
			return auxRoot;

		}
	}

}
