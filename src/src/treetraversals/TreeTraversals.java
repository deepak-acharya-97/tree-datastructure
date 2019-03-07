package treetraversals;

import tree.Node;
import utility.Utilities.Utility;

public class TreeTraversals {

	public static class TreeTraversal {
		public static void inOrderTraversal(Node root) {
			if(Utility.isNull(root)) {
				return;
			}
			inOrderTraversal(root.getLeft());
			Utility.Print(root.getData()+" --> ");
			inOrderTraversal(root.getRight());
		}
		
		public static void preOrderTraversal(Node root) {
			if(Utility.isNull(root)) {
				return;
			}
			Utility.Print(root.getData()+" --> ");
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
		
		public static void postOrderTraversal(Node root) {
			if(Utility.isNull(root)) return;
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			Utility.Print(root.getData()+" --> ");
		}
	}

}
