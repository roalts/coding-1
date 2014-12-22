package coding;


public class PhoneKeypad{
	
	public static void phoneKeypad(String input, int index, String output){
		if(index >= input.length()){
			System.out.print(output + " ");
			return;
		}
		
		int check = Integer.parseInt(input.substring(index, index + 1));
		
		if(check >= 2 && check <= 9){
			int temp = 95;
			for(int i = 2; i < check; i++){
				temp = temp + 2;
			}
			if(check >= 8){
				temp++;
			}
			int j = 3;
			if(check == 7 || check == 9){
				j++;
			}
			while(j > 0){
				char tempChar = (char)(check + temp);
				phoneKeypad(input, index + 1, output + tempChar);
				temp++;
				j--;
			}
		}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "45";
		phoneKeypad(input, 0, "");
	}

}
