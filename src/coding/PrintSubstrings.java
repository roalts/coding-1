package coding;

public class PrintSubstrings {
	
	public static void printSubstring(String input, int begin, int end){
		if(begin == input.length() && end >= input.length()){
			return;
		}
		
		if(end <= input.length()){
			System.out.print(input.substring(begin, end) + "\t");
			printSubstring(input, begin, end + 1);
		}
		else{
			printSubstring(input, begin + 1, begin + 2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abcd";
		printSubstring(input, 0, 1);
	}

}
