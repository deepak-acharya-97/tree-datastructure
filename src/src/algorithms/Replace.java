package algorithms;

import java.util.*;

import tree.Node;
import utility.Utilities.Utility;

public class Replace {

	public static class ReplaceNodeWithSumOfSomething {
		private static class Int {
			private int data;

			public Int(int data) {
				this.data = data;
			}

			public int getData() {
				return data;
			}

			public void setData(int data) {
				this.data = data;
			}
			public void increment() {
				this.data+=1;
			}
		}
		public static Node<Integer> replaceNodeWithSumUtil(Node<Integer> root) {
			if(Utility.isNull(root)) return null;
			Vector<Integer> array = new Vector<>();
			array.add(0);
			storeInorderTraversal(root, array);
			array.add(0);
			Int count=new Int(1);
			replaceNodeWithSum(root, array, count);
			return root;
		}

		private static void replaceNodeWithSum(Node<Integer> root, Vector<Integer> array, Int i) {
			if(Utility.isNull(root)) return;
			replaceNodeWithSum(root.getLeft(), array, i);
			root.setData(array.get(i.getData()-1)+array.get(i.getData()+1));
			i.increment();
			replaceNodeWithSum(root.getRight(), array, i);
		}

		private static void storeInorderTraversal(Node<Integer> root, Vector<Integer> array) {
			if(Utility.isNull(root)) return;
			storeInorderTraversal(root.getLeft(), array);
			array.add(root.getData());
			storeInorderTraversal(root.getRight(), array);
		}
		
	}
	
}
