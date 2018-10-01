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
			assertSame(LowestCommonAncestor(test.root,19,1),1);
			assertSame(test.search(test.root,19,1).key,1);
			
		}
		@Test // test when left or right are not in the tree
		public void testNotInTree()
		{
	 		BST<Integer> test = new BST<Integer>();
			LowestCommonAncestor<Integer> test = new LowestCommonAncestor<Integer>();
			test.put(9);
			test.put(1);
			test.put(4);
			test.put(19);
			test.put(9);
			test.put(13);
			assertNull(LowestCommonAncestor(test.root,19,3));
			assertNull(test.search(test.root,19,3));
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
	}