package lecture13;

import java.util.Scanner;

public class InsertionSort {
	public static void sort(int []a,int i,int j,int demo){
		 if( j==-1)
		 {
			a[0]=demo;
			i++;
			if(i==a.length)
				return ;
			
			sort(a,i,i-1,a[i]);
		 }
		else{
			if(a[j]>demo)
			{
				a[j+1]=a[j];
				sort(a,i,--j,demo);	
			}
			else{
				a[j+1]=demo;
				i++;
				if(i==a.length)
					return ;
				sort(a,i,i-1,a[i]);	
			}
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a,0,-1,a[0]);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
