package data_structures_1;

import java.util.Scanner;

public class Leaders {
	
//	Write a program to print all the LEADERS in the array.
//	An element is leader if it is greater than all the elements 
//	to its right side. And the rightmost element is always a leader. 
//	For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int numberOfElements = scanner.nextInt();
			int input[] = new int[numberOfElements];
			for(int i = 0; i < numberOfElements; i++) {
				input[i] = scanner.nextInt();
			}
			scanner.close();
			longPrintLeaders(input);
	}
	
	public static void longPrintLeaders(int arr[]){
		int arr2[] = new int[arr.length];
		arr2[arr.length-1] = 1;
		int k = arr.length -2;
		int i  = arr.length - 1;
		while(i < arr.length && k >= 0 && arr[k] > arr[i]){
			if(arr[k] > arr[i] && arr2[i] == 1){
				arr2[k] = 1;
				k--;
				i = k+1;
				continue;
			}
			else if(arr[k]<=arr[i]){
				k--;
				i = k+1;
				break;
			}
			i++;
		}
		printArray(arr2);
	}
	
	public static void printArray(int arr[]){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}

}
