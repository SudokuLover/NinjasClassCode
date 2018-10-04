package lecture10;

import java.util.Scanner;

public class ReturnSubsetsSumToK {
	public static int[][] subsetsSumK(int input[], int k1) {
		// Write your code here
		int k[][]=allSubsets(input,0);
      
      int l=0;
      for(int i=0;i<k.length;i++)
      {
        int sum=0;
      	for(int j=0;j<k[i].length;j++)
          {
			sum+=k[i][j];        	
          }
        if(sum==k1)
          l++;
      }
      
      int k2[][] = new int[l][];

      int p=0;
      for(int i=0;i<k.length;i++)
      {
        int sum=0;
      	for(int j=0;j<k[i].length;j++)
          {
			sum+=k[i][j];        	
          }
        if(sum==k1)
          {
        	k2[p]=new int [k[i].length];
          for(int j=0;j<k[i].length;j++)
          {
            k2[p][j]=k[i][j];
          }
          p++;
        }
      }
      return k;
      
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
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
