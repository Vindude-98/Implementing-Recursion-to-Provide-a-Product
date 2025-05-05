import java.util.Scanner;
import java.util.ArrayList;

public class Product {
	
	public static int computeProduct(ArrayList<Integer> nums, int index) {
		
		if (index == nums.size()) {
			return 1;
		}
		
		else {
			return nums.get(index) * computeProduct(nums, index + 1);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> userNums = new ArrayList<>();
		final int NUM_ELEMENTS = 5;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter " + NUM_ELEMENTS + " to be multiplied: ");
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			userNums.add(scnr.nextInt());
		}
		
		int product = computeProduct(userNums, 0);
		
		System.out.println("The product of your numbers is: " + product);
		
		scnr.close();
	}
}