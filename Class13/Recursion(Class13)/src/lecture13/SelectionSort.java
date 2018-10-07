package lecture13;

import java.util.Scanner;

public class SelectionSort {
	
	public static void sort(int []a,int i,int j,int k,int demo){
		if(i==a.length-1)
			return ;
		else if(j==a.length-1)
		{
			int temp=a[i];
			a[i]=demo;
			a[k]=temp;
			
			i++;
			sort(a,i,i,i,a[i]);
		}
		else{
			if(a[j]<demo)
			{
				k=j;
				demo=a[j];
			}
			sort(a,i,++j,k,demo);
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
		sort(a,0,0,0,a[0]);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
