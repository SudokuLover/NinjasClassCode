package lecture6;

import java.util.Scanner;

public class SelectionSort {

	public static void bubbleSort(int []k){

		int n=k.length;
		
		//optimized bubble sort
		
		/*for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(k[j+1]<k[j])
				{
					int o=k[j+1];
					k[j+1]=k[j];
					k[j]=o;;
					
				}
			}
		}*/
		
		
		for(int i=0;i<n;i++)
		{
			int min=k[i];
			int index=-1;
			for(int j=i+1;j<n;j++)
			{
				if(min>k[j])
				{
					min=k[j];
					index=j;
				}
			}
			
			if(index!=-1)
			{
				int o=k[index];
				k[index]=k[i];
				k[i]=o;;
			
			}
			
		//	System.out.println(i);
		}
		
	
	}
	public static void takeInput(){
		Scanner sc = new Scanner(System.in);

		String s=sc.nextLine();
/*		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		sc.close();
		return arr;
	
*/	
	ans(s.length(),s);	
	
	}	
	public static void printArray(int []arr){

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int k[]=
		takeInput();
		//bubbleSort(k);
		//printArray(k);
	}


		public static void ans(int n, String str) {
			//Write your code here
		
	      int arr[]=new int[26];
	      if(n<26)
	      {
	        System.out.println("NO");
	      }
	      else{
	       str=str.toLowerCase();
	        for(int i=0;i<n;i++)
	        {
	          int k=str.charAt(i)-97;
	          //System.out.println(k+" "+str.charAt(i));
	          
	         if(arr[k]!=0)
	            arr[k]++;
	        }
	      
	       for(int i=0;i<26;i++)
	        {
	          if(arr[i]!=0)
	           {
	     		   System.out.println("NO");
	            	return ;
	           }
	      	}
	      
	        System.out.println("YES");
	      	return ;
	    
	      }
	}

}
