package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BinarySum {




	public static class Node {
		int data;
		Node left;
		Node right;
	}

	public static Node constructTree(int[] tree, int begin, int nodes) {
		if(2*begin >= nodes){
			Node node = new Node();
			node.data = tree[begin-1];
			return node;
		}
		Node root = new Node();
		root.data = tree[begin-1];
		root.left = constructTree(tree, begin*2, nodes);
		root.right = constructTree(tree, begin*2 +1, nodes);
		return root;	
	}

	public static int maxHeight(Node root) {
		if(root.left == null && root.right == null) 
			return root.data;
		int leftData = maxHeight(root.left);
		int rightData = maxHeight(root.right);
		return root.data + Math.max(leftData, rightData);
	}

	public static int maxDiameter(Node root) {
		if(root.left == null && root.right == null) {
			return root.data;
		}
		int leftData = Integer.MIN_VALUE;
		int rightData = Integer.MIN_VALUE;
		if(root.left != null)
			leftData = maxDiameter(root.left);

		if(root.right!= null)
			rightData = maxDiameter(root.right);

		int max = Math.max(root.data+maxHeight(root.left)+maxHeight(root.right), Math.max(leftData, rightData));
		return max;
	}

	public static int maxDiameterSum(int nodes, int[] tree) {
		//add code to this function to solve the problem
		//don't write code in this editor
		//your code will not be saved across submissions

		Node root = constructTree(tree, 1, nodes);
		return maxDiameter(root);
	}

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());

		for(int i=0;i<cases;i++){
			int nodes = Integer.parseInt(br.readLine());            

			String[] temp = br.readLine().split(" ");
			int[] tempArr = new int[temp.length];

			for(int j=0;j<temp.length;j++)
				tempArr[j]= Integer.parseInt(temp[j]);

			int answer = maxDiameterSum(nodes, tempArr);
			System.out.println(answer);
		}
	}
}


