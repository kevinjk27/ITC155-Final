import static org.junit.Assert.*;

import org.junit.Test;

public class ListNodeTest {

	@Test
	public void testHasTwoConsecutive() {
		ListNode test1 = new ListNode();
		test1.add(-632);
		test1.add(-528);
		test1.add(-348);
		test1.add(-72);
		test1.add(0);
		test1.add(-8);
		test1.add(9);
		System.out.println(test1.toString() +"\nhas two adjacent numbers: " +test1.hasTwoConsecutive());
		System.out.println();
		assertFalse(test1.hasTwoConsecutive());
		
		
		ListNode test2 = new ListNode();
		test2.add(49);
		test2.add(79);
		test2.add(50);
		test2.add(149);
		test2.add(195);
		System.out.println(test2.toString() +"\nhas two adjacent numbers: " +test2.hasTwoConsecutive());
		System.out.println();
		assertFalse(test2.hasTwoConsecutive());
		
				
		ListNode test3 = new ListNode();
		test3.add(-632);
		test3.add(-528);
		test3.add(-348);
		test3.add(-72);
		test3.add(-1);
		test3.add(0);
		test3.add(9);
		System.out.println(test3.toString() );
		assertTrue(test3.hasTwoConsecutive());
		System.out.println();
		
		ListNode test4 = new ListNode();
		System.out.println(test4.toString() +"\nhas two adjacent numbers: " +test4.hasTwoConsecutive());
		System.out.println();
		assertFalse(test4.hasTwoConsecutive());
	}

}
