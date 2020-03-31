package net.projecteuler.util;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testPrintPreorder() {
		BinaryTree tree = new BinaryTree("1", new BinaryTree("2"), new BinaryTree(3, new BinaryTree("4"), null));
		tree.printPreOrder(tree);
	}
}
