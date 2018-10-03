import static org.junit.Assert.*;
 import org.junit.Test;
 public class LCAtest {
		@Test // test with no nodes
		public void testEmpty() {
			BST<Integer> testBST = new BST<Integer>();
			LowestCommonAncestor<Integer> testBST = new LowestCommonAncestor<Integer>();
			
			assertNull( LowestCommonAncestor(testBST.root, 7, 1));
			assertNull( testBST.search(testBST.root, 7, 1));
		}
	 	@Test // test with only one node in
		public void testSingle()
		{
			BST<Integer> testBST = new BST<Integer>();
			LowestCommonAncestor<Integer> testBST = new LowestCommonAncestor<Integer>();
			testBST.put(7);
			assertNull(LowestCommonAncestor(testBST.root,1,3));
			assertNull(testBST.search(testBST.root,1,3));
			
		}
		
		@Test // test with multiple nodes
		public void testPopulated()
		{
			BST<Integer> test = new BST<Integer>();
			LowestCommonAncestor<Integer> test = new LowestCommonAncestor<Integer>();
			test.put(9);
			test.put(1);
			test.put(4);
			test.put(19);
			test.put(9);
			test.put(13);
			test.put(3);
			test.put(2);
			test.put(15);
			test.put(14);
			test.put(16);
			assertSame(test.search(test.root,19,1).key,9);
			assertSame(test.search(test.root,19,9).key,9);
			assertSame(test.search(test.root,14,16).key,15);
			
		}
		@Test // test when left or right are not in the tree
	public void testNotInTree()
		{
			test.put(19);
			test.put(9);
			test.put(13);
	 		assertNull(test.search(test.root,19,3)); // returns Null so cannot compare key or triggers nullpointer
			assertNull(test.search(test.root,1,20));
			assertNull(test.search(test.root,5,3));
			assertNull(test.search(test.root,5,5));
			assertNull(test.search(test.root,20,1));
			
		}
		@Test // test when v1 and v2 are the same value
		public void testSameValue()
		{
			BST<Integer> test = new BST<Integer>();
			LowestCommonAncestor<Integer> test = new LowestCommonAncestor<Integer>();
			test.put(9);
			test.put(1);
			test.put(4);
			test.put(19);
			test.put(9);
			test.put(13);
			assertSame(LowestCommonAncestor(test.root,9,9),9);
			assertSame(test.search(test.root,9,9).key,9);
		}
		@Test
		public void testGet()
		{
			LowestCommonAncestor<Integer> bst = new LowestCommonAncestor<Integer>(); 	
			assertSame("test get empty tree", null, bst.get(7));
			bst.put(1);
			assertSame("test single tree", 1, bst.get(1));
			bst.put(2);
			bst.put(4);
			bst.put(5);
			assertSame("test value larger than root",4, bst.get(4));
			assertSame("test value smaller than root", 2, bst.get(2));
			assertSame("test value larger but not in tree", null, bst.get(11));
		}
	}