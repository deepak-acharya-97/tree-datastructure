package tree;

import sampletree.SampleTrees.SampleTree;
import treetraversals.TreeTraversals.TreeTraversal;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> root = SampleTree.getSampleTree();
		TreeTraversal.preOrderTraversal(root);
	}

}