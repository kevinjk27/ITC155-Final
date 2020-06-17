/*
 * Ch 17 Binary Trees p. 1077 ex.7 Write a method isFull... 50 points (40 code + 10 test)
 * 
 */

public class IntTreeNode {
	public int data;
	public IntTreeNode left;
	public IntTreeNode right;
	private static IntTreeNode overallRoot;

	// constructs a leaf node with given data
	public IntTreeNode(int data) {
		this(data, null, null);
	}

	// constructs a branch node with given data, left subtree,
	// right subtree
	public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	// post: constructs an empty tree
	public IntTreeNode() {
		overallRoot = null;
	}

	// post: value is added to overall tree so as to preserve the
	// binary search tree property
	public IntTreeNode add(int value) {
		return overallRoot = add(overallRoot, value);
	}

	// post: value is added to given tree so as to preserve the
	// binary search tree property
	private IntTreeNode add(IntTreeNode root, int value) {
		// if empty create node
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}

	// post: returns true if overall tree contains value
	public boolean contains(int value) {
		return contains(overallRoot, value);
	}

	// post: returns true if given tree contains value
	private boolean contains(IntTreeNode root, int value) {
		if (root == null) {
			return false;
		} else if (value == root.data) {
			return true;
		} else if (value < root.data) {
			return contains(root.left, value);
		} else { // value > root.data
			return contains(root.right, value);
		}
	}

	// post: prints the tree contents using a in-order traversal
	public void printInorder() {
		System.out.print("inorder:");
		printInorder(overallRoot);
		System.out.println();
	}

	// post: prints in in-order the tree with given root
	private void printInorder(IntTreeNode root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(" " + root.data);
			printInorder(root.right);
		}
	}

	// post: prints the tree contents using an in-order traversal
	public void print() {
		printInorder(overallRoot);
		System.out.println();
	}

	// post: prints the tree contents, one per line, following an
	// inorder traversal and using indentation to indicate
	// node depth; prints right to left so that it looks
	// correct when the output is rotated.
	public void printSideways() {
		printSideways(overallRoot, 0);
	}

	// post: prints in reversed preorder the tree with given
	// root, indenting each line to the given level
	private void printSideways(IntTreeNode root, int level) {
		if (root != null) {
			printSideways(root.right, level + 1);
			for (int i = 0; i < level; i++) {
				System.out.print("    ");
			}
			System.out.println(root.data);
			printSideways(root.left, level + 1);
		}
	}

	// recursive start at root level and down to the child elements
	public int countEmpty() {
		return countEmpty(overallRoot);
	}

	public int countEmpty(IntTreeNode root) {
		if (root == null) {
			return 1;
		} else {
			return countEmpty(root.left) + countEmpty(root.right);
		}
	}

}
