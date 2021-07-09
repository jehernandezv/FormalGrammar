package test;

import DataStructure.NTree;
import DataStructure.NTreeNode;
import DataStructure.Node;

public class TestNTree {
	
	public static void main(String[] args) {
		NTree<Integer> Ntree = new NTree<Integer>();
		
		Ntree.add(0);
		Ntree.add(1, 0);
		Ntree.add(2, 0);
		
		Node<NTreeNode<Integer>> current = Ntree.getRoot().getChilds().getHead();
		while (current != null) {
			System.out.println(current.getInfo().getInfo()+ " padre: " + Ntree.getRoot().getInfo());
			current = current.getNext();
		}
		
		
		
	}
}
