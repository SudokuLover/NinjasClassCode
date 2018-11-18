package lect25;

import java.util.Scanner;

public class MergeSort {
	public static void bubbleSort(int []arr,int start,int end)
	{
		for(int i=0;i<end;i++)
		{
			for(int j=i;j<end;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int k=arr[j];
					arr[j]=arr[j+1];
					arr[j]=k;
					
				}
			}
		}
	}	
	public static void mergeSort(int []arr,int start,int end)
	{
		if(start>=end)
			return ;
		int mid=(start+end)/2;

		mergeSort(arr, start, mid);
		mergeSort(arr,  mid+1,end);
		merge(arr,start,end);
	}	
	public static void merge(int []arr,int start,int end)
	{
		int mid=(start+end)/2;
		
		int merge[]=new int[end-start+1];
		
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end)
		{
			if(arr[i]<arr[j])
			{
				merge[k++]=arr[i];
				i++;
			}
			else{
				merge[k++]=arr[j];
				j++;			
			}
		}
		while(i<=mid)
		{
				merge[k++]=arr[i];
				i++;
		}
		while(j<=end)
		{
				merge[k++]=arr[j];
				j++;			
		}
		
		for(i=0;i<merge.length;i++)
		{
			arr[start+i]=merge[i];
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=n-i;
		}
		/*for(int val : arr)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		*/
		double startTimeMs=System.currentTimeMillis();
		mergeSort(arr,0,arr.length-1);
		double endTimeMs=System.currentTimeMillis();
		
		/*for(int val : arr)
		{
			System.out.print(val+" ");
		}
		
		System.out.println();
		*/
		double time=endTimeMs-startTimeMs;
		System.out.println("merge sort "+time);
	
		for(int i=0;i<n;i++)
		{
			arr[i]=n-i;
		}
	
		startTimeMs=System.currentTimeMillis();
		bubbleSort(arr,0,arr.length-1);
		endTimeMs=System.currentTimeMillis();
		
		time=endTimeMs-startTimeMs;
		System.out.println("bubble sort "+time);
	
	}

}
