package lecture6;

import java.util.Scanner;

//Linear Searching
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int k[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			k[i]=sc.nextInt();
		}
		
		int p=sc.nextInt();
		
		int index=-1;
		for(int i=0;i<n;i++)
		{
			if(k[i]==p)
			{
				index=i;
				break;
			}
			
		}
		
		if(index!=-1)
		{
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");			
		}
		
	}

}
