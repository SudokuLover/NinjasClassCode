package lecture10;

import java.util.Scanner;

public class PrintSubsets {
	public static void printSubsets(int input[]) {
		// Write your code here
      int a[]={};
		print(input,0,a);
      return ;
	}
  public static void print(int input[],int startIndex,int output[]){
    
    	if(startIndex==input.length)
        {
          for(int i=0;i<output.length;i++)
          {
            System.out.print(output[i]+" ");
          }
          
            System.out.println();
          return ;
        }
    
    int newoutput[]=new int[output.length+1];
    newoutput[0]=input[startIndex];
    for(int i=1;i<=output.length;i++)
    {
    	newoutput[i]=output[i-1];  
    }
    
    print(input,startIndex+1,output);
    print(input,startIndex+1,newoutput);
  	
    return ;
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
		printSubsets(input);
	}
}

