package net.projecteuler.util;

/**
 * 
 * @author Camilo Mercado
 *
 */
public class BinaryTree {
	
	private Object node;
	private BinaryTree left;
	private BinaryTree right;
	
	public BinaryTree(Object node, BinaryTree left, BinaryTree right) {
		this.node = node;
		this.left = left;
		this.right = right;
	}
	
	public BinaryTree(Object node) {
		this.node = node;
	}
	
	public boolean isNullNode() {
		return node == null;
	}
	
	public String getNodeValue() {
		return node != null ? node.toString() : null;
	}
	
	public void printPreOrder(BinaryTree tree) {
		if(tree == null || tree.isNullNode()) {
			return;
		}
		
		System.out.println(tree.getNodeValue());
		printPreOrder(tree.getLeft());
		printPreOrder(tree.getRight());
	}
	
	@Override
	public String toString() {
		return "BinaryTree [node=" + node + "]";
	}

	public Object getNode() {
		return node;
	}

	public void setNode(Object node) {
		this.node = node;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public BinaryTree getRight() {
		return right;
	}
}
