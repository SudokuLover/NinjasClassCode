package lecture13;

import java.util.Scanner;

public class BubbleSortUsingRecursion {
	
	public static void sort(int []a,int i,int j){
		if(i==a.length-1)
			return ;
		else if(j==a.length-1)
		{
			sort(a,++i,0);
		}
		else{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			sort(a,i,++j);
			
		}
			
	}
	
	public static void main(String argsp[]) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sort(a,0,0);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
	}
}
