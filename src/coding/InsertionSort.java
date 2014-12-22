package coding;

public class InsertionSort {
	
	public static void insertionSort(int[] input, int endIndex){
		if(endIndex >= input.length){
			return;
		}
		
		for(int j = endIndex - 1; j >= 0; j--){
			if(input[j] > input[j + 1]){
				int temp = input[j];
				input[j] = input[j + 1];
				input[j + 1] = temp;
			}
			printArray(input);
		}
		
		insertionSort(input, endIndex + 1);
		
		
	}
	
	public static void printArray(int[] input){
		
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + "\t");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,3,2,1};
		insertionSort(input, 0);
		

	}

}
