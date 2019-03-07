package algorithms;

import java.util.*;

import tree.Node;
import utility.Utilities.Utility;

public class Replace {

	public static class ReplaceNodeWithSumOfSomething {
		public static Node<Integer> replaceNodeWithSumUtil(Node<Integer> root) {
			if(Utility.isNull(root)) return null;
			Vector<Integer> array = new Vector<>();
			array.add(0);
			storeInorderTraversal(root, array);
			array.add(0);
			replaceNodeWithSum(root, array, 1);
			return root;
		}

		private static void replaceNodeWithSum(Node<Integer> root, Vector<Integer> array, int i) {
			if(Utility.isNull(root)) return;
			replaceNodeWithSum(root.getLeft(), array, i);
			root.setData(array.get(i-1)+array.get(i+1));
			replaceNodeWithSum(root.getRight(), array, i+1);
		}

		private static void storeInorderTraversal(Node<Integer> root, Vector<Integer> array) {
			if(Utility.isNull(root)) return;
			storeInorderTraversal(root.getLeft(), array);
			array.add(root.getData());
			storeInorderTraversal(root.getRight(), array);
		}
		
	}
	
}
