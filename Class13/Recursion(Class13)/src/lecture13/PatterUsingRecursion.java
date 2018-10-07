package lecture13;

import java.util.Scanner;

public class PatterUsingRecursion {

	public static void print(int row,int k,int n,int mark){
		if(row>n)
			return ;

		if(k<=(n-row) && mark==0)
		{
			System.out.print(" ");
			print(row,++k,n,mark);
		}
		else if(k<=row && mark==1)
		{
			if(row==1)
			{
				System.out.println("  "+1);
				
				print(++row,0,n,0);	
			}
			else{
				System.out.print(permutation(row,k)+" ");
				print(row,++k,n,mark);
			}
		}
		else{
			if(mark==0)
				print(row,0,n,1);
			else
			{
				System.out.println();
				print(++row,0,n,0);
			}
		}
		//printLayer(k,n);
		//print(row,++k,n);
			return ;	
	}
	
/*	public static void print(int k,int n){
		if(k>n)
			return ;

		printLayer(k,n);
		print(++k,n);
			return ;
		
	}
	public static void printSpace(int k,int n){
		if(k==n)
			return ;
		System.out.print(" ");

		printSpace(k+1,n);
		return ;
	}
	public static void printValue(int k,int i){
		if(i>k)
			return ;
		System.out.print(permutation(k,i)+" ");

		printValue(k,i+1);
		return ;
	}
	
	public static void printLayer(int k,int n){
		printSpace(k,n);
		if(k!=1)
			{
				printValue(k,0);
			}
			else{
				System.out.print(" "+1);
			}
			System.out.println();
	}
*/
	public static int permutation(int n,int r){
		
		int k=fact(n)/(fact(r)*fact(n-r));
			return k;
		}
	public static int fact(int n){
		int k=1;
		
		while(n>0)
		{
			k*=n--;
		}
		
		return k;
	}
		public static void main(String argsp[]) {
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			print(1,1,n,0);
			sc.close();
		}
}
