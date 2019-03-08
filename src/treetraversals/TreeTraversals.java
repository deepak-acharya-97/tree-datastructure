package treetraversals;

import java.util.*;
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
		
		public static void iterativeInOrderTraversal(Node root) {
			if(Utility.isNull(root)) return;
			Stack<Node> stack = new Stack<>();
			Node curr=root;
			
			while(Utility.isNotNull(curr) || stack.size()>0) {
				while(Utility.isNotNull(curr)) {
					stack.push(curr);
					curr=curr.getLeft();
				}
				curr=stack.pop();
				Utility.Print(curr.getData()+"--> ");
				curr=curr.getRight();
			}
		}
	}

}
