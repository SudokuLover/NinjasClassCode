package lecture3;

import java.util.*;
public class PermutaionCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=sc.nextInt();

		int factN=1;
		int i=1;
		while(i<=n)
		{
			factN=factN * i;
			i=i+1;
		}
		System.out.println(factN);
		
		int factR=1;
		 i=1;
		while(i<=r)
		{
			factR=factR * i;
			i=i+1;
		}
		System.out.println(factR);
		

		int factNminusR=1;
		 i=1;
		while(i<=(n-r))
		{
			factNminusR=factNminusR * i;
			i=i+1;
		}
		System.out.println(factNminusR);
		
		
		int ncr=factN/(factR*factNminusR);
		System.out.println(ncr);
	}

}
