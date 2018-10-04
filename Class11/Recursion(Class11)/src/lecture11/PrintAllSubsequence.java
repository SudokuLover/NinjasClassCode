package lecture11;

import java.util.Scanner;

public class PrintAllSubsequence {
	
	public static int[][] returnAllSubsets(int []input ,int startIndex){
		if(startIndex==input.length)
		{
			int [][]reval={{}};
			return reval;
		}
		
		int[][] roaSubsets=returnAllSubsets(input,startIndex+1);
		int[][] totalSubsets=new int[roaSubsets.length*2][];
		
		int i=0;
		for(;i<roaSubsets.length;i++)
		{
			totalSubsets[i]=new int[roaSubsets[i].length];
			for(int j=0;j<roaSubsets[i].length;j++)
			{
				totalSubsets[i][j]=roaSubsets[i][j];
			}
		}
		
		int k=0;
		for(;i<totalSubsets.length;i++,k++)
		{
			totalSubsets[i]=new int[roaSubsets[k].length+1];
			totalSubsets[i][0]=input[startIndex];
			for(int j=1;j<totalSubsets[i].length;j++)
			{
				totalSubsets[i][j]=roaSubsets[k][j-1];
			}
		}

		
		return totalSubsets;
		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int [][]a= returnAllSubsets(arr,0);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}

}
	