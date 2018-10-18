package arun.training.challenges.datastructures.model;

public class BinaryNode {

	private int data;
	private BinaryNode left;
	private BinaryNode right;

	public BinaryNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setLeft(BinaryNode left) {
		this.left = left;
	}

	public BinaryNode getLeft() {
		return this.left;
	}

	public BinaryNode getRight() {
		return this.right;
	}

	public void setRight(BinaryNode right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "{data:" + data + ",left:" + left + ",right:" + right + "}";
	}

}