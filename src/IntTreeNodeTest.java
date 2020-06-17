import static org.junit.Assert.*;

import org.junit.Test;

public class IntTreeNodeTest {

	@Test
	public void testIsFull() {
		IntTreeNode sampleTree = new IntTreeNode();
		IntTreeNode overallRoot = null;
		overallRoot = sampleTree.add(17);
		overallRoot = sampleTree.add(14);
		overallRoot = sampleTree.add(5);
		overallRoot = sampleTree.add(27);
		overallRoot = sampleTree.add(31);
		overallRoot = sampleTree.add(28);
		overallRoot = sampleTree.add(8);
		sampleTree.printSideways();
		System.out.println("The tree is full: "+sampleTree.isFull());
		assertFalse(sampleTree.isFull());
		System.out.println();

		IntTreeNode sampleTree1 = new IntTreeNode();
		overallRoot = sampleTree1.add(3);
		overallRoot = sampleTree1.add(2);
		overallRoot = sampleTree1.add(5);
		overallRoot = sampleTree1.add(1);
		overallRoot = sampleTree1.add(4);
		overallRoot = sampleTree1.add(6);
		sampleTree1.printSideways();
		System.out.println("The tree is full: "+sampleTree1.isFull());
		assertFalse(sampleTree1.isFull());
		System.out.println();
		
		IntTreeNode sampleTree4 = new IntTreeNode();
		overallRoot = sampleTree4.add(47);
		overallRoot = sampleTree4.add(13);
		overallRoot = sampleTree4.add(59);
		overallRoot = sampleTree4.add(9);
		overallRoot = sampleTree4.add(25);
		overallRoot = sampleTree4.add(33);
		overallRoot = sampleTree4.add(14);
		sampleTree4.printSideways();
		System.out.println("The tree is full: "+sampleTree4.isFull());
		assertTrue(sampleTree4.isFull());
		System.out.println();

		
		
		IntTreeNode sampleTree5 = new IntTreeNode();
		overallRoot = sampleTree5.add(12);
		overallRoot = sampleTree5.add(3);
		overallRoot = sampleTree5.add(13);
		overallRoot = sampleTree5.add(4);
		overallRoot = sampleTree5.add(2);
		sampleTree5.printSideways();
		System.out.println("The tree is full: "+sampleTree5.isFull());
		assertTrue(sampleTree5.isFull());

	}

}
