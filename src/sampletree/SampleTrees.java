package sampletree;
import tree.Node;

public class SampleTrees {

	public static class SampleTree {
		public static Node<Integer> getSampleTree() {
			return new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(4), new Node<Integer>(5)), new Node<Integer>(3, new Node<Integer>(6), new Node<Integer>(7)));
		}
	}

}
