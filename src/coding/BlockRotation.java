package data_structures_1;

public class BlockRotation {
	

	public static void main(String[] args) {
		int input[] = ArrayUtil.takeInput();
		rotateArray(input, 1);
		ArrayUtil.print(input);
	}

	public static void rotateArray(int[] array, int n){
		int arr[] = new int[array.length];
		for(int i = 0; i < array.length; i++){
			arr[i] = array[i];
		}
		
		for(int i = n; i < array.length; i++){
			array[i-n] = arr[i];
		}
		for(int i = 0; i < n; i++){
			array[i+arr.length-n] = arr[i];
		}
	}
}
