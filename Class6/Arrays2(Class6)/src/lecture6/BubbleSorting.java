package lecture6;

import java.util.Scanner;

public class BubbleSorting {

	public static void bubbleSort(int []k){

		int n=k.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(k[j+1]<k[j])
				{
					int o=k[j+1];
					k[j+1]=k[j];
					k[j]=o;;
					
				}
			}
		}
	
	}
	public static int[] takeInput(){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		sc.close();
		return arr;
	}	
	public static void printArray(int []arr){

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=takeInput();
		bubbleSort(k);
		printArray(k);
	}


}
