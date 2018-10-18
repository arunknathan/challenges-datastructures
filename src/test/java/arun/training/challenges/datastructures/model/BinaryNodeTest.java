package arun.training.challenges.datastructures.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BinaryNodeTest {

	@Test
	public void testData() {
		int data = 1;
		BinaryNode node = new BinaryNode(data);
		Assert.assertEquals(node.getData(), data);
	}

	@Test
	public void testLeft() {
		BinaryNode node = new BinaryNode(1);
		int data = 2;
		BinaryNode left = new BinaryNode(data);
		node.setLeft(left);
		Assert.assertEquals(node.getLeft().getData(), data);
	}

	@Test
	public void testRight() {
		BinaryNode node = new BinaryNode(1);
		int data = 2;
		BinaryNode right = new BinaryNode(data);
		node.setRight(right);
		Assert.assertEquals(node.getRight().getData(), data);
	}

	@Test
	public void testToString() {
		BinaryNode node = new BinaryNode(1);
		Assert.assertEquals(node.toString(), "{data:1,left:null,right:null}");
	}
}
