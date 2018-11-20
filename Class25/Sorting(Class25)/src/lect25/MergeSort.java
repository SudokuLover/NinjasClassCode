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
	
	public static void quickSort(int []arr,int start,int end)
	{
		if(start>=end)
			return ;
		int k=partitionByMaam(arr,start,end);
		//int k=partition(arr,start,end);
		quickSort(arr, start,k-1);	
		quickSort(arr, k+1,end);
	}	
	public static int partition(int []arr,int start,int end)
	{
		int k=arr[end];
		int j=start-1;
		for(int i=start;i<end;i++)
		{
			if(arr[i]<k)
			{
				j++;
				int l=arr[j];
				arr[j]=arr[i];
				arr[i]=l;
		//		System.out.println(arr[i]+" "+arr[j]);
			}
		}
		j++;
		int l=arr[j];
		arr[j]=arr[end];
		arr[end]=l;

		return j;
	}
	public static int partitionByMaam(int []arr,int start,int end)
	{
		int pivotElement = arr[start];
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(arr[i]<pivotElement)
			{
				count++;
			}
		}
		int pivotIndex=start+count;
		arr[start]=arr[pivotIndex];
		arr[pivotIndex]=pivotElement;
		
		int i=start;
		int j=end;
		while(i<pivotIndex && j > pivotIndex)
		{
			if(arr[i]<pivotElement)
				i++;
			else if(arr[j]>=pivotElement)
				j--;
			else
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
	return pivotIndex;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		assign(arr);
		
		//print(arr);
		
		
		double startTimeMs=System.currentTimeMillis();
		//mergeSort(arr,0,arr.length-1);
		double endTimeMs=System.currentTimeMillis();

		//print(arr);
		
		double time=endTimeMs-startTimeMs;
	//	System.out.println("merge sort "+time);
	
		assign(arr);
		
		startTimeMs=System.currentTimeMillis();
		//bubbleSort(arr,0,arr.length-1);
		endTimeMs=System.currentTimeMillis();
	
		time=endTimeMs-startTimeMs;
		//System.out.println("bubble sort "+time);
	
		
		assign(arr);
		
		startTimeMs=System.currentTimeMillis();
		quickSort(arr,0,arr.length-1);
		endTimeMs=System.currentTimeMillis();
		
		time=endTimeMs-startTimeMs;
		
		print(arr);
		System.out.println("quick sort "+time);
	
	
	}

	public static void print(int arr[])
	{
		for(int val : arr)
		{
			System.out.print(val+" ");
		}
		
		System.out.println();
		
	}
	public static void assign(int arr[])
	{	int n=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=n-i;
		}
		
	}
}
