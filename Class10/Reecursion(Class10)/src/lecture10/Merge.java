package lecture10;

import java.util.Scanner;

public class Merge {

	public static void mergeSort(int[] input){
		// Write your code here
		sort(input,0,input.length-1);
      return ;
	}
  
  public static void sort(int [] input, int l , int r ){
    
    if(l==r)
      return ;
    
    int m=(l+r)/2;
    sort(input,l,m);
    sort(input,m+1,r);
    merge(input,l,m,r);
    return ;
  }
  
  public static void merge(int [] input , int l,int m,int r){
    int [] a=new int[m-l+1];
    int b[]=new int[r-m];
    
    int j=0;
    for(int i=l;i<=m;i++)
    {
      a[j++]=input[i];
    }
    j=0;
    for(int i=m+1;i<=r;i++)
    {
      b[j++]=input[i];
    }
    
    int i=0;
    j=0;
     int k=l;
    while(i<a.length && j<b.length)
    {
      if(a[i]<b[j])
      {
        input[k++]=a[i];
        i++;
      }
      else{
      input[k++]=b[j];
        j++;
      }
    }
     while(i<a.length)
    {
        input[k++]=a[i];
        i++;
    }
     while(j<b.length)
    {
        input[k++]=b[j];
        j++;
    }
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
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);

		 int a='2'-'0';
         int b='3'-'0';
         System.out.println(a+" "+b);
         int c=(10*a)+b;
         char ch=(char)(c+96);
		System.out.print((char)((ch-'0')+96));
         System.out.print(ch);
	}
	
	
	

}

