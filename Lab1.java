package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {

	static final int CREATE_ARRAY = 1;
	static final int FILL_ARRAY = 2;
	static final int COUNT_NUMS = 3;
	static final int DISPLAY_ARRAY = 4;
	static final int SORT_ARRAY = 5;
	static final int EXIT = 0;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		Numbers n = new Numbers();

		do {
			System.out.println("Enter " + CREATE_ARRAY + " to make an array,\n"
					+ FILL_ARRAY + " to populate the array,\n" + COUNT_NUMS
					+ " to count the specified number,\n" + DISPLAY_ARRAY
					+ " to show the array,\n" + SORT_ARRAY + " to sort the array,\n" + EXIT + " to Exit");
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("That was an invalid input. Numbers only please.");
				scanner.next();
			}
			switch (input) {
			case CREATE_ARRAY:
				System.out
						.println("Enter the size of the Array you want to make:");
				int i = scanner.nextInt();
				n = new Numbers(i);
				break;
			case FILL_ARRAY:
				n.generateNumbers();
				break;
			case COUNT_NUMS:
				System.out.println("Which number do you want to count?");
				int e = scanner.nextInt();
				n.countNums(e);
				break;
			case DISPLAY_ARRAY:
				n.toString();
				break;
			case SORT_ARRAY:
				n.sortNums();
				break;
			case EXIT:
				break;
			}

		} while (input != EXIT);
		scanner.close();
	}
}
