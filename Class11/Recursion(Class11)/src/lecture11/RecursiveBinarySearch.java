package lecture11;

import java.util.Scanner;

public class RecursiveBinarySearch {
/*	public static int binarySearch(int[] arr,int left,int right, int element){
		
		int mid=(left+right)/2;
		if(arr[mid]==element)
		{
			return mid;
		}
		else if(arr[mid]>element){
			return binarySearch(arr,left,mid-1,element);
		}
		else{
			return binarySearch(arr,mid+1,right,element);	
		}
		
	}*/


	// element - number to be searched
	public static int binarySearch(int arr[], int element) {
		// Write your code here

      if(arr.length==0)
        return -1;

      int mid=arr.length/2;
  		if(arr[mid]==element)
		{
  			return mid;
		}
		else if(arr[mid]>element){
          
          int arr1[]=new int[mid];
          for(int i=0;i<mid;i++)
          {
            arr1[i]=arr[i];
          }
			return binarySearch(arr1,element);
		}
		else {
          
          int arr1[]=new int[arr.length-mid-1];
          for(int i=mid+1;i<arr.length;i++)
          {
            arr1[i-mid-1]=arr[i];
          }
			int k= binarySearch(arr1,element);
			if(k==-1)
				return k;
          return k+mid+1;
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int element = sc.nextInt();
		//	System.out.println(binarySearch(arr,0,n,element));
		
		
		/*for(int i=0;i<n;i++)
		{
			System.out.println(binarySearch(arr,arr[i]));
		}*/
		
		
		System.out.println(binarySearch(arr,element));
	}
}
