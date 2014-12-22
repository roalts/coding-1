package coding;

public class GenerateCode {
	
	public static void generateCode(String input, int begin, int end, String output){
		if(begin >= input.length() || end >= input.length()){
			return;
		}

		if(Integer.parseInt(input.substring(begin, end + 1)) >= 10 && Integer.parseInt(input.substring(begin, end + 1)) <= 26){
			output = output + (char)(Integer.parseInt(input.substring(begin, end + 1)) + 96);
			generateCode(input, begin + 2, end + 2, output);
			System.out.print(output + "\t");
		}
		if(Integer.parseInt(input.substring(begin, end)) >= 1 && Integer.parseInt(input.substring(begin, end)) <= 9){
			output = output + (char)(Integer.parseInt(input.substring(begin, end)) + 96);
			generateCode(input, begin + 1, end + 1, output);
			System.out.print(output + "\t");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1123";
		generateCode(a, 0, 1, "");
	}

}
