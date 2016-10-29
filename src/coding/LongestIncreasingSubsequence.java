package coding;

public class LongestIncreasingSubsequence {

	public static int lis(int[] input) {
		int temp[] = new int[input.length];
		int max = 0;
		for(int i = 0; i < input.length; i++) {
			temp[i] = 1;
		}
		for(int i = 1; i < input.length; i++) {
			for(int j = 0; j < i; j++) {
				if(input[j] < input[i]) {
					temp[i] = Math.max(temp[i], temp[j]+1);
					if(temp[i] > max) 
						max = temp[i];
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] input = {3,4,-1,0,6,2,3};
		System.out.println(lis(input));
	}
}
