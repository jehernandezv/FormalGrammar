package Structure;

public class NTreeNode<T> {

	protected T info;
	protected SimpleList<NTreeNode<T>> childs;

	public NTreeNode(T info, SimpleList<NTreeNode<T>> childs) {
		this.info = info;
		this.childs = childs;

	}

	public NTreeNode(T info) {
		this.info = info;
		this.childs = new SimpleList<>();
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public SimpleList<NTreeNode<T>> getChilds() {
		return childs;
	}

	public void setChilds(SimpleList<NTreeNode<T>> childs) {
		this.childs = childs;
	}

}
