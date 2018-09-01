package class2_Code;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int i=1;
		
		int sum=0;
		
		while(i<=n)
		{
			sum +=sc.nextInt();
			i++;
		}
		
		System.out.println("sum of "+n+" numbers is :"+sum);

	}

}
