package coding;

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int[] input, int beginIndex, int endIndex){
		
		if(beginIndex >= endIndex){
			return;
		}
		
		int mid = (beginIndex + endIndex)/2;
		mergeSort(input, beginIndex, mid);
		mergeSort(input, mid + 1, endIndex);
		
		merge(input, beginIndex, mid, endIndex);
		
	}
	
	public static void merge(int[] input, int begin, int mid, int end){
		int size = end - begin + 1;
		int[] mergedArray = new int[size];
		int i = begin;
		int j = mid + 1;
		int k = 0;
		while(k < size){
			if(i > mid){
				if(j <= end){
					mergedArray[k] = input[j];
					j++;
				}
			}
			if(j > end){
				if(i <= mid){
					mergedArray[k] = input[i];
					i++;
				}
			}
			if(i <= mid && j <= end){
				if(input[i] < input[j]){
					mergedArray[k] = input[i];
					i++;
				}
				else{
					mergedArray[k] = input[j];
					j++;
				}
			}
			k++;	
		}
		i = 0;
		for(int l = begin; l <= end; l++){
			input[l] = mergedArray[i];
			i++;
		}
	}
	
	public static int[] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size");
		int size = s.nextInt();
		int[] input = new int[size];
		
		for(int i = 0; i < size; i++){
			System.out.println("Enter next element");
			input[i] = s.nextInt();
		}
		
		return input;
	}
	
	public static void printArray(int[] input){
		
		for(int i = 0; i < input.length; i++){
			System.out.print(input[i] + "\t");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[100000];
		for(int i = 0; i < 100000; i ++){
			input[i] = 100000 - i;
		}
		long t1 = System.currentTimeMillis();
		mergeSort(input, 0, input.length - 1);
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);

	}

}
