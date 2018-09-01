package class2_Code;

import java.util.Scanner;

public class LargestOfN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int i=2;
		
		int num=sc.nextInt();
		
		while(i<=n)
		{
			int k=sc.nextInt();
			if(num<=k)
				num=k;
			i++;
		}
		
		System.out.println("Largest among "+n+" numbers is :"+num);

	}

}
