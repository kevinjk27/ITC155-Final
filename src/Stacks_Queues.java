/* ITC155 Final Assignment Spring 2020
 * 6/17/2020
 * 
 * Ch 14 Stacks & Queues  p. 925 ex. 5 Write a method equals....  50 points (40 code + 10 test)
 */

import java.util.*;

public class Stacks_Queues {

	// when the size is different it is automatically false
	public static boolean equals(Stack<Integer> S_1, Stack<Integer> S_2) {
		if (S_1.size() != S_2.size()) {
			return false;
		}

		Stack<Integer> S_Aux = new Stack<Integer>();
		boolean outcome = true;
		while (!S_1.isEmpty()) {
			// moving each element in the Stack 1 & 2 to auxiliary stack
			int element_2 = S_2.pop();
			int element_1 = S_1.pop();

			S_Aux.push(element_1);
			S_Aux.push(element_2);

			// comparing each element
			if (element_1 != element_2) {
				outcome = false;
			}
		}

		// pushing back the element to the original order by pushing to S_2 first as
		// stack is LIFO
		while (!S_Aux.isEmpty()) {
			S_2.push(S_Aux.pop());
			S_1.push(S_Aux.pop());
		}

		// return the outcome
		return outcome;
	}

	public static void main(String[] args) {
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
		System.out.println("The two stacks are equals: " + equals(S_1, S_2));
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
		System.out.println("The two stacks are equals: " + equals(S_3, S_4));
		System.out.println();
	}

}
