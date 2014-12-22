package coding;

public class CheckString {
	
	public static boolean checkString(String input, int index){
		if(input.length() <= 0){
			return false;
		}
		if(input.charAt(0) != 'a'){
			return false;
		}
		if(index > input.length() - 1){
			return true;
		}
		
		if(input.substring(index, index + 1).equals("a")){
			if(index == input.length() - 1){
				return true;
			}
			if(input.substring(index + 1,index + 2).equals("a")){
				return checkString(input, index + 1);
			}
			if(index >= input.length() - 2){
				return false;
			}
			if(input.substring(index + 1, index + 3).equals("bb")){
				return checkString(input, index + 3);
			}
			else{
				return false;
			}
		}
		
				
		if(input.substring(index, index + 2).equals("bb")){
			if(index >= input.length() - 2){
				return true;
			}
			if(input.substring(index + 2, index + 3).equals("a")){
				return checkString(input, index + 3);
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abbabb";
		System.out.println(checkString(a, 0));

	}

}
