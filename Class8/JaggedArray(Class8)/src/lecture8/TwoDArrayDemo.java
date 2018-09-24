package lecture8;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [][]arr = new  int [3][4];
		
		//arr[2][4]=46;
		//this is exceeding the array index as highest index is 3
		//System.out.println(arr[0][0]);
	
	
		int [][]arr =takeInput();
		
		printArray(arr);
	}
	
	public static int[][] takeInput(){
		
		Scanner sc = new Scanner(System.in);

		int rows=sc.nextInt();
		int cols=sc.nextInt();
		
		int [][]arr=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		return arr;
	}
	
	public static void printArray(int [][]arr){

		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+ " ");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
