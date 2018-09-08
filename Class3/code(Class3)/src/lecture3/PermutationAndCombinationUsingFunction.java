package lecture3;
import java.util.*;

public class PermutationAndCombinationUsingFunction {

	

	 public static int findFactorial(int k)
	 {
		 int fact=1;
		 int i=1;
		 while(i<=k)
		 {
			 fact=fact*i;
			 i=i+1;
		 }
		 return fact;
	 }	

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		
		int factN=findFactorial(n);
		int factR=findFactorial(r);
		int factNminusR=findFactorial(n-r);
		
		//int ncr = findFactorial(n)/(findFactorial(r)*findFactorial(n-r));
		int ncr=factN/(factR*factNminusR);
		
		System.out.println(ncr);
	}
	
}
