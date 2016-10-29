package data_structures_1;

public class OddOccurence {

	public static void main(String[] args) {
		int input[] = ArrayUtil.takeInput();
		System.out.print(getOddOccurrence(input)+"");

	}
	
	public static int getOddOccurrence(int ar[])
	{
	     int i;
	     int ar_size = ar.length;
	     int res = 0; 
	     for (i=0; i < ar_size; i++)     
	        res = res ^ ar[i];
	      
	     return res;
	}

}
