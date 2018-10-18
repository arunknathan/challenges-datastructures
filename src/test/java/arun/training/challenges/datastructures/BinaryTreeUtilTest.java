package arun.training.challenges.datastructures;

import org.testng.Assert;
import org.testng.annotations.Test;

import arun.training.challenges.datastructures.model.BinaryNode;

public class BinaryTreeUtilTest {

	private BinaryTreeUtil util = new BinaryTreeUtil();

	@Test
	public void testFindLCA() {
		BinaryNode root = generateTestData(4, 1);
		BinaryNode lca = util.findLCA(root, 10, 11);
		Assert.assertEquals(lca.getData(), 5);
	}

	private BinaryNode generateTestData(int level, int v) {
		BinaryNode root = new BinaryNode(v);
		if (level > 0) {
			--level;
			root.setLeft(generateTestData(level, 2 * v));
			root.setRight(generateTestData(level, 2 * v + 1));
		} else {
			return null;
		}
		return root;
	}
}
