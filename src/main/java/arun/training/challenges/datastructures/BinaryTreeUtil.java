package arun.training.challenges.datastructures;

import arun.training.challenges.datastructures.model.BinaryNode;

public class BinaryTreeUtil {

	public BinaryNode findLCA(BinaryNode root, int v1, int v2) {

		if (root.getData() == v1 || root.getData() == v2) {
			return root;
		}

		BinaryNode leftLCA = null;
		BinaryNode rightLCA = null;

		if (root.getLeft() != null) {
			leftLCA = findLCA(root.getLeft(), v1, v2);
		}
		if (root.getRight() != null) {
			rightLCA = findLCA(root.getRight(), v1, v2);
		}

		if (leftLCA != null && rightLCA != null) {
			return root;
		} else {
			return leftLCA == null ? rightLCA : leftLCA;
		}
	}

}
