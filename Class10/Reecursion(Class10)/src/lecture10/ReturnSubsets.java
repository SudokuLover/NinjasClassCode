package lecture10;

import java.util.Scanner;

public class ReturnSubsets {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
      return allSubsets(input,0);

	}
  
  public static int[][] allSubsets(int input[],int index){
    if(index==input.length)
    {
      int [][]retval={{}};
      return retval;
    }
    else{
      int row[][]=allSubsets(input,index+1);
      int arr[][]=new int[row.length*2][];
      int i=0;
      for(;i<row.length;i++)
      {
        arr[i]=new int[row[i].length];
       	for(int j=0;j<row[i].length;j++)
          arr[i][j]=row[i][j];
      }
      
      int k=0;
      for(;i<arr.length;i++)
      {
     	arr[i]=new int[row[k].length+1];
        arr[i][0]=input[index];
       	for(int j=1;j<=row[k].length;j++)
          {
        	arr[i][j]=row[k][j-1];
          }
       	k++;
      }
      return arr;
    }
    
  }
  public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
