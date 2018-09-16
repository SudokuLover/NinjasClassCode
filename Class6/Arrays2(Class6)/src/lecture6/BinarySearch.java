package lecture6;

import java.util.Scanner;

public class BinarySearch {

	static int element;
	public static int binarySearch(int []k,int p){

		int n=k.length;
		int index=-1;
		int start=0;
		int end=n-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(k[mid]==p)
			{
				index=mid;
				break;
			}
			else if(p>k[mid])
			{
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		
		return index;
	}
	public static int[] takeInput(){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		element=sc.nextInt();
		
		sc.close();
		return arr;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[]=takeInput();
		
		int index=binarySearch(k,element);
		if(index!=-1)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");			
		}
	}

}
