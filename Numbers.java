package Lab1;

import java.util.Arrays;
import java.util.Random;

public class Numbers {
	private int[] nums;
	private int count;

	public Numbers() {
		nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
	}

	public Numbers(int count) {
		nums = new int[count];
	}

	public void generateNumbers() {

		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(100);
		}
	}

	public int countNums(int e) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == e) {
				count++;
			} else if (nums[i] > e) {
				break;
			}
		}
		System.out.println("There is " + count + " " + e + " in the array\n" );
		return count;
	}

	public String toString() {
		String numbers = Arrays.toString(nums);
		System.out.println(numbers);
		return numbers;

	}
	
	public void sortNums(){
		
		int temp;
		
		for(int i = nums.length; i >= 0; i--){
			for(int j = 0; j < (i-1); j++){
				if(nums[j] > nums[j+1]){
					temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
	}
}
