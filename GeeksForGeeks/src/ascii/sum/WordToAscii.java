package ascii.sum;

import java.util.Optional;

public class WordToAscii {

	/*
	 * Empty or null check in Java8
	 */
	public static void main(String[] args) {
		String inputString = "GeeksforGeeks, a computer science portal for geeks";
		int length = convertToAscii(inputString);

	}

	private static int convertToAscii(String inputString) {
		int sum = 0;
		int totalSum = 0;

		Optional<String> isValid = Optional.ofNullable(inputString);

		/*
		 * if(isValid.isPresent()) { System.out.println(isValid.get()); }else {
		 * System.out.println("Empty or null"); }
		 */

		if (!isValid.isPresent()) {
			System.out.println("input string shuld be present");
			return 0;
		}
		for (int i = 0; i < inputString.length() - 1; i++) {
			if(inputString.charAt(i)==' ') {
				totalSum+=sum;
				sum = 0;
			}
			sum += inputString.charAt(i);

		}
		
		if(sum!=0) {
			totalSum+=sum;
		}
		System.out.println("SUM -->" + totalSum);
		return sum;
	}
}
