package arrays;

public class PhoneKeypad {

	public static String[] phonekeypad = new String[] {
		"2abc", "3def", "4ghi", "5jkl", "6mno", "7pqrs", "8tuv", "9wxyz"
	};
	
	public static void printKeypad(String input, int beginIndex, String s) {
		if(beginIndex >= input.length()) {
			System.out.println(s);
			return;
		}
		for(int i = 0; i < phonekeypad.length; i++) {
			if(input.charAt(beginIndex) == phonekeypad[i].charAt(0)) {
				for(int j = 1; j < phonekeypad[i].length(); j++)
				printKeypad(input, beginIndex + 1, s + phonekeypad[i].charAt(j));
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println(i);
			
			printKeypad(String.valueOf(i), 0, "");
			System.out.println();
		}
	}
}
