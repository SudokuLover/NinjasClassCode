package lecture5;

import java.util.Scanner;

public class FlowOfArraay {

	public static int[] takeInput(){
		
		ArraysDemo a=new ArraysDemo();
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

		int []arr1=takeInput();
		//getting reference of an array generated in heap by takeInput();
		
		printArray(arr1);
	}

}


/*
 * Explain proper functionality using Stack and Heap memory for each functions
 * 
 * 
 * */
