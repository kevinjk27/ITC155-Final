import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class Stacks_QueuesTest {

	@Test
	public void testEquals() {

		Stack<Integer> S_1 = new Stack<Integer>();
		Stack<Integer> S_2 = new Stack<Integer>();

		Stack<Integer> S_3 = new Stack<Integer>();
		Stack<Integer> S_4 = new Stack<Integer>();

		Integer[] data = { 4, 7, 9, 54, 6 };
		for (int num : data) {
			S_1.push(num);
		}

		S_2.push(4);
		S_2.push(8);
		S_2.push(11);
		S_2.push(61);
		S_2.push(85);

		System.out.println(S_1);
		System.out.println(S_2);
		System.out.println("The two stacks are equals: " + Stacks_Queues.equals(S_1, S_2));
		assertFalse(Stacks_Queues.equals(S_1, S_2));
		assertEquals(false, Stacks_Queues.equals(S_1, S_2));
		System.out.println();

		Integer[] data1 = { 4, 7, 9, 54, 6 };
		for (int num : data1) {
			S_3.push(num);
		}

		S_4.push(4);
		S_4.push(7);
		S_4.push(9);
		S_4.push(54);
		S_4.push(6);

		System.out.println(S_3);
		System.out.println(S_4);
		System.out.println("The two stacks are equals: " + Stacks_Queues.equals(S_3, S_4));
		assertTrue(Stacks_Queues.equals(S_3, S_4));
		assertEquals(true, Stacks_Queues.equals(S_3, S_4));
		System.out.println();
	}

}
